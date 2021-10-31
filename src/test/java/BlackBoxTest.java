import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackBoxTest {

    @Test
    public void test1(){
        String total = BlackBox.checkout(0, 50);
        assertEquals("Invalid input", total, 1);
    }

    @Test
    public void test2(){
        String total = BlackBox.checkout(100, 50);
        assertEquals("13500", total, 1);
    }

    @Test
    public void test3(){
        String total = BlackBox.checkout(1, 50);
        assertEquals("144", total, 1);
    }

    @Test
    public void test4(){
        String total = BlackBox.checkout(3, 0);
        assertEquals("450", total, 1);
    }

    @Test
    public void test5(){
        String total = BlackBox.checkout(3, 3);
        assertEquals("441", total, 1);
    }

    @Test
    public void test6(){
        String total = BlackBox.checkout(3, 42);
        assertEquals("432", total, 1);
    }

    @Test
    public void test7(){
        String total = BlackBox.checkout(12, 0);
        assertEquals("1764", total, 1);
    }

    @Test
    public void test8(){
        String total = BlackBox.checkout(12, 3);
        assertEquals("1728", total, 1);
    }

    @Test
    public void test9(){
        String total = BlackBox.checkout(12, 44);
        assertEquals("1692", total, 1);
    }

    @Test
    public void test10(){
        String total = BlackBox.checkout(61, 0);
        assertEquals("8601", total, 1);
    }

    @Test
    public void test11(){
        String total = BlackBox.checkout(61, 2);
        assertEquals("8418", total, 1);
    }

    @Test
    public void test12(){
        String total = BlackBox.checkout(61, 44);
        assertEquals("8235", total, 1);
    }

    @Test
    public void test13(){
        String total = BlackBox.checkout(123, 0);
        assertEquals("16605", total, 1);
    }

    @Test
    public void test14(){
        String total = BlackBox.checkout(123, 4);
        assertEquals("16236", total, 1);
    }

    @Test
    public void test15(){
        String total = BlackBox.checkout(123, 44);
        assertEquals("15682.5", total, 1);
    }
}
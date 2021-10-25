import java.util.ArrayList;
import java.util.List;

public class BlackBox {
    public static final int priceEach = 100;

    public static double checkout(int quantity, int cumulativePoints) {
        double discount = 0;
        if(cumulativePoints < 0 || cumulativePoints > 100) {
            System.out.println("Invalid input");
            return -1;
        }
        if(quantity < 1 || quantity > 200) {
            System.out.println("Invalid input");
            return -1;
        }
        if(1 <= quantity && 10 > quantity) {
            if(cumulativePoints == 0){}
            else if(cumulativePoints > 0 && cumulativePoints < 40) discount = 0.02;
            else discount = 0.04;
        }
        if(10 <= quantity && 60 > quantity) {
            if(cumulativePoints == 0) discount = 0.02;
            else if(cumulativePoints > 0 && cumulativePoints < 40) discount = 0.04;
            else discount = 0.06;
        }
        if(60 <= quantity && 120 > quantity) {
            if(cumulativePoints == 0) discount = 0.06;
            else if(cumulativePoints > 0 && cumulativePoints < 40) discount = 0.08;
            else discount = 0.1;
        }
        if(120 <= quantity && 200 >= quantity) {
            if(cumulativePoints == 0) discount = 0.1;
            else if(cumulativePoints > 0 && cumulativePoints < 40) discount = 0.12;
            else discount = 0.15;
        }
        double total = 150 * (double)quantity * (1 - discount);
        return total;
    }
}

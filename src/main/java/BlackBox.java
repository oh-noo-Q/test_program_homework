public class BlackBox {
    public static final int priceEach = 150;
    public static String checkout(int quantity, int cumulativePoints) {
        double discount = 0;
        String total = "";
        if(cumulativePoints < 0 || cumulativePoints > 100 || quantity < 1 || quantity > 200) {
            total = "Invalid input";
        }
        else {
            if (1 <= quantity && 10 > quantity) {
                if (cumulativePoints == 0) {}
                else if (cumulativePoints > 0 && cumulativePoints < 40)
                    discount = 0.02;
                else discount = 0.04;
            }
            else if (10 <= quantity && 60 > quantity) {
                if (cumulativePoints == 0)
                    discount = 0.02;
                else if (cumulativePoints > 0 && cumulativePoints < 40)
                    discount = 0.04;
                else discount = 0.06;
            }
            else if (60 <= quantity && 120 > quantity) {
                if (cumulativePoints == 0)
                    discount = 0.06;
                else if (cumulativePoints > 0 && cumulativePoints < 40)
                    discount = 0.08;
                else discount = 0.1;
            }
            else if (120 <= quantity && 200 >= quantity) {
                if (cumulativePoints == 0)
                    discount = 0.1;
                else if (cumulativePoints > 0 && cumulativePoints < 40)
                    discount = 0.12;
                else discount = 0.15;
            }
            total = Double.toString(priceEach * (double) quantity * (1 - discount));
        }
        return total;
    }
}

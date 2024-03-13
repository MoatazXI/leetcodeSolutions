public class Main {
    public boolean lemonadeChange(int[] bills) { // simulation
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                ten++;
                if (five > 0) {
                    five--;
                } else return false;
            } else if (bill == 20) {
                if (ten > 0 && five > 0) { // priority for 10 and 5 , is higher than 3 fives
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }
}
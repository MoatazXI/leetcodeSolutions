public class Main {
    //    public int alternateDigitSum(int n) {
//        int sum = 0, sign = 1;
//        String number = String.valueOf(n);
//        int len = number.length();
//        for (int i = 0; i < len; i++) {
//            sum += (number.charAt(i) - '0') * sign;
//            sign *= -1;
//        }
//        return sum;
//    }
    public int alternateDigitSum(int n) {
        int sum = 0, sign = 1, rem = 0;
        while (n > 0) {
            sign *= -1;
            rem = n % 10;
            n = n / 10;

            sum += rem * sign;
        }
        return sum * sign;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.alternateDigitSum(521));
    }
}
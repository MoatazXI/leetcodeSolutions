import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public int[] plusOne(int[] digits) {
        int len = digits.length;

        for (int i = len - 1; i >= 0 ; i--) {

            if (digits[i] < 9){ // if num is not 9 we have to add 1 and return , finish
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0; // if num is 9 , definitely it have to be 0
        }

        digits = new int[len + 1]; // if we didn't return from last loop , it means number is 999 and it will be 000 , in this case we need new array with bigger size
        digits[0] = 1; // it have to be 1 in first because if num 999 and next one is 1000 , last loop generate 000 , and adds 1 in start of arr

        return digits;
    }



    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.plusOne(new int[]{4,9,9}));
    }
}
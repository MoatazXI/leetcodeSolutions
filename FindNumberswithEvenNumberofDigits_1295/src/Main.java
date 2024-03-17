public class Main {
    private int countDigit(int n) { // log-based solution
        return (int) Math.floor(Math.log10(n) + 1);
    }

    public int findNumbers(int[] nums) {
        // o(1)
        // also we can convert number to string and return its length
        // or using traditional while loop with reminder variable ,counter and return variable count
        int len = nums.length, counter = 0;

        for (int i = 0; i < len; i++) {
            int numOfDigits = countDigit(nums[i]);
            if (numOfDigits % 2 == 0) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(new int[]{12,345,2,6,7896});
    }
}
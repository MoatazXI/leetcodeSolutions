public class Main {
    public int missingNumber(int[] nums) {
        // O(n) time , O(1) space
        //missing number will be diff between summation of our number and summation from 1 to n , because numbers are unique
        int sumOfOriginalNums = 0 , sumOfNumsFrom1toN = 0 , len = nums.length;

        for (int i = 0; i < len; i++) {
            sumOfOriginalNums += nums[i];
        }
        sumOfNumsFrom1toN = len * (len + 1)/2;

        return sumOfNumsFrom1toN - sumOfOriginalNums;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
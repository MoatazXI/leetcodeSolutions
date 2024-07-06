import java.util.Arrays;

public class Main {
    // O(n) time , O(n) space , prefix sum
//    public int[] runningSum(int[] nums) {
//        int len = nums.length;
//        int []prefix = new int[len];
//
//        prefix[0] = nums[0];
//
//        for (int i = 1; i < len; i++) {
//            prefix[i] = prefix[i-1] + nums[i];
//        }
//
//        return prefix;
//    }

    // O(n) time , O(1) space
    public int[] runningSum(int[] nums) {
        int len = nums.length;

        for (int i = 1; i < len; i++) {
            nums[i] = nums[i-1] + nums[i];
        }

        return nums;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(Arrays.toString(obj.runningSum(new int[]{1,2,3,4})));

    }
}
public class Main {

    // O(n^3) time
//    public int maxSubArray(int[] nums) {
//        int len = nums.length;
//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i < len; i++) {
//            for (int j = i; j < len; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += nums[k];
//                }
//                maxSum = Math.max(maxSum, sum);
//            }
//        }
//
//        return maxSum;
//    }

    // kadane's algorithm  O(n) time
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int maxSum = Integer.MIN_VALUE , currentSum = 0;

        for (int i = 0; i < len; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) maxSum = currentSum; // keep track of maximum sum so far
            if (currentSum < 0) currentSum = 0; // discard negative sum
        }

        return maxSum;
    }

    public static void main(String[] args) {

    }
}

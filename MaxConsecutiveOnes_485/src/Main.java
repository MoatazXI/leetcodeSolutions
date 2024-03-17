public class Main {
//    public int findMaxConsecutiveOnes(int[] nums) {
//        // so bad solution , to do list
//
//        int count = 0, len = nums.length;
//        ArrayList<Integer> counters = new ArrayList<>();
//        for (int i = 0; i < len; i++) {
//            if (nums[i] == 1) {
//                count++;
//            } else {
//                count = 0;
//            }
//            counters.add(count);
//
//        }
//
//        return Collections.max(counters);
//    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0, curCount = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) { // if equal to zero , we need to store maximum consecutive ones we found.

                curCount = 0; // because we need to start count again.
            } else {
                curCount++;
            }
            if (maxCount < curCount) { // if current tracked subarray is greater than prev max , store curr as max
                maxCount = curCount;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
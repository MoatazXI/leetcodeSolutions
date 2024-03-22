public class Main {
    public int numIdenticalPairs(int[] nums) {
        // brute force , O(n^2) , not better solution
        int len = nums.length, counter = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j] && i < j) {
                    counter++;
                }
            }
        }
        return counter++;
    }


    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }
}
import java.util.Arrays;

public class Main {
    /*public boolean containsDuplicate(int[] nums) {
        // hashmap to store frequency for each element
        // after freq , we need to find if any value greater than 1 means there is duplicate element
        Map<Integer , Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num , freq.getOrDefault(num , 0 ) + 1);
        }

        for (int val : freq.values()) {
            if (val > 1) return true;
        }

        return false;
    }

    public boolean containsDuplicate(int[] nums) { // Time limit , O(n^2)
        // brute force , try all possibilities
        // first loop picks element and nested loop try this element with all of others
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }

        return false;
    }*/


    public boolean containsDuplicate(int[] nums) {
        // after sort , check each two adjacent elements , if there is equality , means duplicate
        // complexity O(nlogn) for sorting
        int len = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(obj.containsDuplicate(new int[]{1, 2, 3, 4}));

    }
}
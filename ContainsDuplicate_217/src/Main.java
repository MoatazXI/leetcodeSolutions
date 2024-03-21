import java.util.HashSet;
import java.util.Set;


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
    }


    public boolean containsDuplicate(int[] nums) {
        // after sort , check each two adjacent elements , if there is equality , means duplicate
        // complexity O(nlogn) for sorting
        int len = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }*/

    public boolean containsDuplicate(int[] nums) {
        // Complexity O(n)
        // we can add to set , check first if element already in set then return true
        //// add function adds element to set if is not inside it , if element already there function will return false ,
        // then if returns false means element is there means duplication , use not false to get inside if condition and return true
        Set<Integer> setOfUniqueElements = new HashSet<>();

        for (int num : nums) {
            if (!setOfUniqueElements.add(num)) {
                return true;
            }
        }

        return false; // there is no duplicates
    }

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(obj.containsDuplicate(new int[]{1, 2, 3, 4}));

    }
}
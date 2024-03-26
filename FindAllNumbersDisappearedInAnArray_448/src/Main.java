import java.util.*;

public class Main {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        Set<Integer> numbers = new HashSet<>();
        List<Integer> missingNumbers = new ArrayList<>();
        for (int n : nums) {
            numbers.add(n);
        }
        for (int i = 1; i <= len; i++) {
            if (!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
//    private static int binarySearch(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] == target) {
//                return mid;
//            }
//
//            if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return -1; // target not found
//    }


//    public List<Integer> findDisappearedNumbers(int[] nums) {
    // not working , todolist
//        int len = nums.length;
//        List<Integer> missingNumbers = new ArrayList<>();
//
//        for (int i = 1; i <= len; i++) {
//            if (binarySearch(nums, i) == -1) {
//                missingNumbers.add(i);
//            }
//        }
//        return missingNumbers;
//    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(obj.findDisappearedNumbers(new int[]{1, 1}));

    }
}
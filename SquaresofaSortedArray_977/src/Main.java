import java.util.Arrays;

public class Main {
    public int[] sortedSquares(int[] nums) {
        // O(n)

        int i = 0, j = nums.length - 1, ptr = nums.length - 1;
        int[] squaredNums = new int[nums.length];

        while (i < j) {
            if (Math.abs(nums[j]) > Math.abs(nums[i])) {
                squaredNums[ptr--] = nums[j] * nums[j];
                j--;
            } else {
                squaredNums[ptr--] = nums[i] * nums[i];
                i++;
            }
        }
        return squaredNums;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }
}
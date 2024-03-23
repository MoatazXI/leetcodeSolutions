import java.util.Arrays;

public class Main {
    public int[] buildArray(int[] nums) {
        // time and space are o(n)
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.buildArray(new int[]{0 , 2 , 1 , 5 , 3 , 4}));
    }
}
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public int findMaxConsecutiveOnes(int[] nums) {
        // so bad solution , to do list

        int count = 0, len = nums.length;
        ArrayList<Integer> counters = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            counters.add(count);

        }

        return Collections.max(counters);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
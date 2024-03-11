import java.util.Arrays;

public class Main {
    /*public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int ele : nums) {
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        int associatedKey = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                associatedKey = entry.getKey();
            }
        }

        return associatedKey;
    }*/
    public int majorityElement(int[] nums) {
        /*
         the majority element will always be present at index n/2, where n is the size of the array.
         This is because the majority element occurs more than n/2 times, and when the array is sorted, it will occupy the middle position.
          */
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
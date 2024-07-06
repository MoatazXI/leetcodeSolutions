import java.util.Arrays;

public class Main {
    // O(n) time , O(n) space
//    public int[] shuffle(int[] nums, int n) {
//        int[] shuffledArray = new int[n * 2];
//
//        int j = 0, k = n;
//
//        for (int i = 0; i < n*2; i+=2) {
//            shuffledArray[i] = nums[j];
//            shuffledArray[i+1] = nums[k];
//            j++;
//            k++;
//        }
//
//        return shuffledArray;
//    }

    // O(1) space ,in-place solution , O(n) time
    public int[] shuffle(int[] nums, int n) {
        int idx = 0 , len = n*2;

        for (int i = n; i < len; i++) {
            nums[i] = (nums[i]*1024) + nums[i-n];
        }

        for (int i = n; i < len; i++) {
            nums[idx] = nums[i] % 1024;
            nums[idx + 1] = nums[i] / 1024;
            idx+=2;
        }

        return nums;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(Arrays.toString(obj.shuffle(new int[]{2 , 5 , 1 , 3 ,4 , 7} , 3)));
    }


}

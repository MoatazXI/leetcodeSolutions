public class Main {
    /*public int[] getConcatenation(int[] nums) {
        // #1
        // O(n) , but modulo operator is time consuming
        int len = nums.length;
        int[] res = new int[2 * len];
        for (int i = 0; i < 2 * len; i++) {
            res[i] = nums[i%len];
        }
        return res;
    }
    public int[] getConcatenation(int[] nums) {
        // #2
        // arraycopy method is O(n) nearly.
        int len = nums.length;
        int[] res = new int[2 * len];
        System.arraycopy(nums , 0 , res , 0 , len);
        System.arraycopy(nums , 0 , res , len , len);
        return res;
    }*/
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] res = new int[2 * len];
        for (int i = 0; i < len; i++) {
            //  res[i + len] = res[i] = nums[i]; or.
            res[i + len] = nums[i];
            res[i] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.getConcatenation(new int[]{1, 2, 3}));
    }
}
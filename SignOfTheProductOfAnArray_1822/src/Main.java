public class Main {
    /*public int arraySign(int[] nums) {
        int len = nums.length;
        long resOfProduct = 1;
        for (int i = 0; i < len; i++) { // we just have to deal with the sign not result of number , we can treat each number as 1 , -1 to avoid overflow
            if (nums[i] == 0) return 0; // if there is any 0 means the final result is zero , finish
            if (nums[i] > 0) nums[i] = 1; // replace each pos number with 1 to avoid overflow
            if (nums[i] < 0) nums[i] = -1; // // replace each neg number with -1 to avoid overflow
            resOfProduct *= nums[i];
        }
        return resOfProduct > 0 ? 1 : -1;
    }*/

    public int arraySign(int[] nums) {
        // another simple sol
        // we can flip the sign each time we see negative number
        /* -1 -1 -1 1 1 -1
            if sign is pos and in first iteration -1 will flip the sign into neg , next iteration is neg , negative of negative is positive
            sign = -1 >> -(-1) = 1 and so on , the sign continue in flipping between 1 , -1 till the end of list
        * */
        int len = nums.length;
        int sign = 1; // let sign as positive , we will flip it when we face negative number.
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) return 0;
            if (nums[i] < 0) sign = -sign;
        }
        return sign;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.arraySign(new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24}));
    }
}
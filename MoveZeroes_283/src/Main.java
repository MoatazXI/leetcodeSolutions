public class Main {
   /* public void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {

            for (int j = 0; j < len - i - 1; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }
            System.out.println(nums);

    }*/
   public void moveZeroes(int[] nums) {
       int snowBallSize = 0 , len = nums.length;

       for (int i = 0; i < len; i++) {
           if (nums[i] == 0) snowBallSize++;
           else if (snowBallSize > 0){ // it means there is zeros found and current number is not zero , it is time to shift, then swap current element back steps equal to number of zeros
               int temp = nums[i];
               nums[i] = 0;
               nums [i - snowBallSize] = temp;
           }
       }
       System.out.println(nums);

   }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
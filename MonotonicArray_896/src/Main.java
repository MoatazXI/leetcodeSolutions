import java.util.Arrays;

public class Main {

    public boolean isMonotonic(int[] nums) {
        /*
        * using one path , one variable for detect direction
        * if direction chenged from increasing 1 to decreasing -1 means this is not monotonic array
        * if passed loop without returning ,means all element in one pattern
        * */
        int len = nums.length , direction = 0; // 0 is unknown (means i don't know yet arr is dec or inc).

        if (len <= 2) return true; // arrays with 0 or 1 or 2 elements is monotonic

        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i-1]){ // check for increasing
                if (direction == 0) direction = 1; // if direction was unknown , set it as increasing , to keep track of inc pattern
                else if (direction == -1) return false; // if direction just changed between inc and dec , stop
            } else if (nums[i] < nums[i - 1]) { // check for decreasing
                if (direction == 0) direction = -1; // set it as decreasing
                else if(direction == 1) return false; // means pattern changed from inc to dec
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.isMonotonic(new int[]{6 , 5 , 4 , 1 , 3}));

    }
}
import java.util.Arrays;

public class Main {
    public boolean canMakeArithmeticProgression(int[] arr) {

        int len = arr.length;
        Arrays.sort(arr);
        for (int i = 2; i < len; i++) {
            if (arr[i] - arr[i - 1] != arr[i - 1] - arr[i - 2]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.canMakeArithmeticProgression(new int[]{1 , 2 , 4}));
    }
}
import java.util.Arrays;

public class Main {

    /*public void merge(int[] nums1, int m, int[] nums2, int n) {
        // we need first m element at nums1 with all nums2 elements , append nums2 with nums1 starting from idx m , then sort
        //O((m+n)log(m+n))
        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }*/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // points at end of elements in nums1
        int j = n - 1; // points at end of nums1
        int ptr = m + n - 1; // end of nums1

        while (j >= 0) { // there is elements in nums2
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[ptr--] = nums1[i];
                i--;
            } else {
                nums1[ptr--] = nums2[j];
                j--;
            }
        }
    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
public class Main {
    public void reverseString(char[] s) {
        // using two pointers  , we can use stack , first push all characters then pop them again
        /*
        * one pointer first of list and other at last
        * swap between i and j as long i > j
        * O(n) time , in-place algorithm
        */

        int i = 0 , j = s.length - 1;

        while(i < j){

            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;

            i++; j--;
        }

    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(new char[]{'h','e','l','l','o'});
    }
}
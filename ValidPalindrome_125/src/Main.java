public class Main {
    private boolean isAlphanumeric(char ch) {
        return ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'));
    }

    private char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch;
    }
//    public boolean isPalindrome(String s) {
//        StringBuilder cleanedString = new StringBuilder();
//
//        for (char ch : s.toCharArray()) {
//            ch = toLowerCase(ch);
//            if (isAlphanumeric(ch)) {
//                cleanedString.append(ch);
//            }
//        }
//
//        StringBuilder reversedString = new StringBuilder(cleanedString);
//        reversedString = reversedString.reverse();
//
//        return cleanedString.compareTo(reversedString) == 0;
//    }

    /*public boolean isPalindrome(String s) {
        StringBuilder cleanedString = new StringBuilder();

        for (char ch : s.toCharArray()) {
            ch = toLowerCase(ch);
            if (isAlphanumeric(ch)) {
                cleanedString.append(ch);
            }
        }
        int len = cleanedString.length();
        for (int i = 0, j = len - 1; i <= len / 2 && j >= 0; i++, j--) {
            if (cleanedString.charAt(i) != cleanedString.charAt(j)) return false;
        }

        return true;
    }*/
    public boolean isPalindrome(String s) {
        // two pointers ,just single loop with a couple of conditions , obviously better than last two solutions
        // o(n)
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char leftCh = toLowerCase(s.charAt(left)) , rightCh = toLowerCase(s.charAt(right));

            if (!isAlphanumeric(leftCh)) { // if left index is not alphanumeric skip this character
                left++;
                continue;
            }
            if (!isAlphanumeric(rightCh)) { // if right index is not alphanumeric skip this character
                right--;
                continue;
            }

            if (leftCh != rightCh) { // if both of them not equal means not palindrome
                return false;
            }

            left++ ;
            right--;

        }

        return true;
    }


    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
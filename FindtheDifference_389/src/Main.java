import java.util.Arrays;

public class Main {
    /*
    public char findTheDifference(String s, String t) {

        int sLength = s.length(), tLength = t.length();

        ArrayList chars = new ArrayList();

        for (int i = 0 ; i < tLength ; i++) {
            chars.add(t.charAt(i));
        }

        for (int i = 0; i < sLength; i++) {
            if (chars.contains(s.charAt(i))){
                chars.remove(chars.indexOf(s.charAt(i)));
            }
        }

        return (char)chars.get(0);
    }
     */

    /*public char findTheDifference(String s, String t) {

        int sLength = s.length(), i = 0;

        char[] word1 = s.toCharArray(), word2 = t.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);

        while(i < sLength){
            if(word1[i] != word2[i]){
                return word2[i];
            }
            i++;
        }

        return word2[i];
    }*/

    public char findTheDifference(String s, String t) {

        int sLength = s.length() , tLength = t.length();
        int sCount = 0 , tCount = 0;
        for (int i = 0; i < sLength; i++) {
            sCount += (int)s.charAt(i);
        }
        for (int i = 0; i < tLength; i++) {
            tCount += (int)t.charAt(i);
        }

        return (char)(tCount-sCount);
    }


    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.findTheDifference("abcd", "abcde"));
    }
}
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*public String reverseVowels(String s) {
        char [] word = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int i = 0 , j = s.length() - 1;
        while(i < j){
            // if current char is not in vowels , means this is not our correct index , go ahead until you find vowel index
            while(i < j && !vowels.contains(word[i]+"")){ // move pointer until you find vowel
                i++;
            }

            while(i < j && !vowels.contains(word[j]+"")){ // move pointer until you find vowel
                j--;
            }

            // after moving two pointers to point at vowel , we swap
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;

            i++;
            j--;

        }
        return new String(word);
    }*/

    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] word = s.toCharArray();

        int i = 0, j = s.length() - 1;

        while (i < j) {

            if (!vowels.contains(word[i])) { // if current index is not vowel , move
                i++;
            } else if (!vowels.contains(word[j])) {
                j--;
            } else { // this case become true if last two conditions not met , means current indices points at vowels
                char temp = word[i];
                word[i] = word[j];
                word[j] = temp;
                i++;
                j--;
            }

        }
        return new String(word);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.reverseVowels("leetcode"));
    }
}
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
//    public boolean isAnagram(String s, String t) {
//        char[] word1 = s.toCharArray(), word2 = t.toCharArray();
//        Arrays.sort(word1);
//        Arrays.sort(word2);
//        return Arrays.equals(word1,word2);
//    }

    public boolean isAnagram(String s, String t) {

        Map<Character , Integer> freq = new HashMap<>();

        for (char ch:s.toCharArray()) {
            freq.put(ch , freq.getOrDefault(ch , 0) + 1);
        }

        for (char ch:t.toCharArray()) {
            freq.put(ch , freq.getOrDefault(ch , 0) - 1);
        }

        for (int ob:freq.values()) {
            if (ob != 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.isAnagram("anagram", "nagaram"));
    }
}
import java.util.Iterator;
import java.util.Stack;

public class Main {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != '*') {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }
        for (Object ch:st) {
            str.append(ch);
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.removeStars("leet**cod*e"));
        System.out.println(obj.removeStars("erase*****"));
    }
}
public class Main {
    public String reverseWords(String s) {
        String[] splittedString = s.split(" ");
        int len = splittedString.length;
        StringBuilder str = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            if (!splittedString[i].equals("")) {
                s += splittedString[i];
                s += " ";
            }
        }
        return s.trim();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.reverseWords("a good   example"));
    }
}
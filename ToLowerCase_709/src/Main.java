public class Main {
    /*public String toLowerCase(String s) {
        return s.toLowerCase();
    }*/

    public String toLowerCase(String s) {
        StringBuilder lowerCaseWord = new StringBuilder();
        for (char ch:s.toCharArray()) {
            if (ch >= 'A' && ch <='Z')lowerCaseWord.append((char)(ch + 32));
            else lowerCaseWord.append(ch);

        }
        return lowerCaseWord.toString();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.toLowerCase("LOVELY"));
    }
}
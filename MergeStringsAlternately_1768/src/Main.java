public class Main {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int word1Length = word1.length(), word2Length = word2.length(), i = 0, j = 0;

        while (i < word1Length || j < word2Length) {
            if (i < word1Length){
                mergedString.append(word1.charAt(i));
                i++;
            }
            if(j < word2Length){
                mergedString.append(word2.charAt(j));
                j++;
            }
        }
        return mergedString.toString();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.mergeAlternately("abcd", "pq"));
    }
    
}
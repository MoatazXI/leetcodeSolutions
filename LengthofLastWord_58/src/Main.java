public class Main {
    /*public int lengthOfLastWord(String s) {
        String[] listOfWords = s.split(" "); // to separate each word as string
        return listOfWords[listOfWords.length - 1].length();// to return last element's length
    }*/
    public int lengthOfLastWord(String s) {
        s = s.trim(); // to remove leading and trailling space
        int idxOfLastSpace = s.lastIndexOf(' '); // last index of space is the location of starting last word
        String lastWord = s.substring(idxOfLastSpace + 1); //lastword is idxof last space + 1
        return lastWord.length();
    }

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
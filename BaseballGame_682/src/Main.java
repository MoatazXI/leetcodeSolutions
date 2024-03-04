import javax.swing.*;
import java.util.*;

public class Main {

    public int calPoints(String[] operations) {
        int sumOfScores = 0 , len = operations.length;
        Stack<Integer> score = new Stack();

            for (String op : operations) {

                if (op.equals("C")) {
                    score.pop();
                } else if (op.equals("D")) {
                    score.push(2 * score.peek());
                } else if (op.equals("+")) {
                    int tempTop = score.pop(); // to store prev element for this operation
                    int newTop = tempTop + score.peek(); // after removing prev element now second prev element became at top , now we can add prev two scores
                    score.push(tempTop); // after getting done with prev score we can add it in its old place
                    score.push(newTop);
                } else {
                    score.push(Integer.valueOf(op)); // to store string value as integer object in stack
                }

            }


        for (int sc : score) {
            sumOfScores += sc;
        }

        return sumOfScores;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.calPoints(new String[]{"5","2","C","D","+"}));
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)){
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                result.add("Fizz");
            }
            else if(i % 5 == 0){
                result.add("Buzz");
            }
            else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.fizzBuzz(3));
        System.out.println(obj.fizzBuzz(5));
        System.out.println(obj.fizzBuzz(15));
    }
}
public class Main {
   /* public int countOdds(int low, int high) {
        int count = 0;
        for(int i = low; i <= high;i++){
            if(i % 2 != 0) count++;
        }

        return count;
    }

    public int countOdds(int low, int high) {
          /*
            Approach: Total numbers in the range will be (R – L + 1) i.e. N.
            If N is even then the count of both odd and even numbers will be N/2.
            If N is odd,
            If L or R is odd, then the count of the odd numbers will be N/2 + 1, and even numbers = N – countofOdd.
            Else, the count of odd numbers will be N/2 and even numbers = N – countofOdd
            * *

        int totalNumOfRange = high - low + 1;
        if (totalNumOfRange % 2 == 0) return totalNumOfRange / 2;
        else{
            if (high % 2 != 0 || low % 2 != 0){
                return totalNumOfRange / 2 + 1;
            }
        }

        return totalNumOfRange / 2;
    }*/

    public int countOdds(int low, int high) {
        //the count of odd numbers between 1 and low - 1 is low / 2
        //the count of odd numbers between 1 and high is (high + 1 ) / 2
        return (high + 1) / 2 - (low / 2);
    }


    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.countOdds(6 , 10));
    }
}
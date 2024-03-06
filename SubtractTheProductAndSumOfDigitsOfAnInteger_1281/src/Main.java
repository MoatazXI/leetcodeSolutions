public class Main {
    public int subtractProductAndSum(int n) {
        // O(logn)
        int sum = 0 , product = 1;

        while(n > 0){

            int digit = n % 10;
            n = n / 10;
            sum += digit;
            product *= digit;

        }

        return product - sum;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.subtractProductAndSum(1234)); // 24 - 10
    }
}
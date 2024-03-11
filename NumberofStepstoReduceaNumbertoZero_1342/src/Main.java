public class Main {
    public int numberOfSteps(int num) {
        return count(num, 0);
    }

    private int count(int num, int count) {
        if (num == 0) return count;

        if (num % 2 == 0) {
            num /= 2;
            return count(num, ++count);
        }
        else if (num % 2 != 0) {
            num--;
            return count(num, ++count);
        }

        return count;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.numberOfSteps(14));
    }
}
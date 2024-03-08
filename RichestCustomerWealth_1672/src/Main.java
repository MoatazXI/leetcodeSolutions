public class Main {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) { // iterate over rows
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) { // work inside each row
                sum += accounts[i][j];
            }

            max = Math.max(sum , max); // to get maximum between each row's sum

        }

        return max;
    }

    public static void main(String[] args) {

        Main obj = new Main();
        System.out.println(obj.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));


    }
}
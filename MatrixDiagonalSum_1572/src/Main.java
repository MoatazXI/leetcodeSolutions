public class Main {
    public int diagonalSum(int[][] mat) {
        int summ = 0, len = mat.length;

        for (int row = 0; row < len; row++) {
            for (int col = 0; col < len; col++) {
                if (row == col || row + col == len - 1) {
                    summ += mat[row][col];
                }
            }
        }

        return summ;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(obj.diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}));
    }
}
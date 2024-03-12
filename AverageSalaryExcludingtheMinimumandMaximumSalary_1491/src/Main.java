public class Main {
    /*public double average(int[] salary) {
        // complexity o(nlogn) beacuse of sort
        Arrays.sort(salary);
        double avg = 0 , sum = 0;
        for(int i = 1 ; i < salary.length - 1 ; i++){
            sum += salary[i];
        }
        avg = sum / (salary.length - 2);
        return avg;
    }*/
    public double average(int[] salary) {
        // complexity O(n)
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double sum = 0, avg = 0;
        for (int number : salary) {
            if (number > max) max = number;
            if (number < min) min = number;
            sum += number;
        }

        avg = (sum - max - min) / (salary.length - 2);
        return avg;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.average(new int[]{4000 , 3000 , 1000, 2000}));
    }
}
public class Main {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int matchedEmployees = 0;
        for (int element : hours) {
            if (element >= target) matchedEmployees++;
        }
        return matchedEmployees;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.numberOfEmployeesWhoMetTarget(new int[]{1,2,2,3,5,0}, 2));
    }
}
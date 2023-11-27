import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int iter = -1;
        for (int i = 1; i < 19; i++) {
            String str = sc.nextLine();
            if (str.equals("Week " + i)) {
                str = sc.nextLine();
                Scanner grades = new Scanner(str);
                int smallest = Integer.MAX_VALUE;
                while (grades.hasNext()) {
                    int grade = grades.nextInt();
                    smallest = Integer.min(smallest, grade);
                }
                result = (result * 10) + smallest;
                iter++;
            } else if (str.equals("42"))
                break;
            else{
                System.out.println("IllegalArgument");
                System.exit(-1);
            }
        }
        getDigits(result, 1, iter);
        // for (int i = iter; i >= 0; i--) {
        // System.out.println((int)(result / Math.pow(10, i)));
        // result -= result / (int)Math.pow(10, i) * (int)Math.pow(10 , i);
        // }
    }

    public static int getDigits(int nums, int week, int numOfWeeks) {
        if (nums / 10 == 0) {
            return (nums);
        } else {
            System.out.println("Week " + (numOfWeeks - week) + " "
                    + "=".repeat(getDigits(nums / (week > 1 ? 10 : 1), week + 1, numOfWeeks)) + ">");
            return (nums % 10);
        }
    }
}
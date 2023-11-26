import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i = 1; i < 19; i++) {
            String str = sc.nextLine();
            if (str.equals("Week " + i)) {
                str = sc.nextLine();
                Scanner grades = new Scanner(str);
                int smallest = 100;
                while(grades.hasNext()){
                    int grade = grades.nextInt();
                    smallest = Integer.min(smallest, grade);
                }
                result = (result * 10) + smallest;
            }
            else
                break;
        }
        System.out.println("smallest is " + result);
    }
    

}
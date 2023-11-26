import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int divider = 1;
        int steps = 0;
        if (num <= 1){
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        if (num == 2)
            System.out.println("true 1");
        else {
            while (num / divider > 1 && divider < Math.sqrt(num)) {
                if (divider > 1 && num % divider == 0)
                    break;
                divider += 1;
                steps++;
            }
            System.out.println((divider > 1 && (num % divider != 0)) + " " + (steps));
        }
    }
}

package ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int coffeeCount = 0;
        while (true) {
            String str = sc.nextLine();
            int sum = sumDigits(str);
            if (str.equals("42")){
                System.out.println("Count of coffee-request : " + coffeeCount);
                System.exit(1);
            }
            if (isPrime(sum))
                coffeeCount++;

        }
    }

    private static int sumDigits(String str) {
        int nbr = Integer.parseInt(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += i > 0 ? nbr % (int) Math.pow(10, (i + 1)) / (int) Math.pow(10, i) : nbr % 10;
        }
        return sum;
    }

    private static boolean isPrime(int nbr) {
        if (nbr <= 1) {
            return false;
        }
        
        if (nbr % 2 == 0)
            return  nbr == 2 ? true :  false;
        for (int i = 1; i < nbr / 2; i += 2) {
            if (nbr % i == 0 && i > 1)
                return false;
        }
        return true;
    }

}

public class Sum{
    public static void main(String[] args){
        int num = 10;
        int total = num % 10 + num % 100 /10 + num % 1000 /100 + num % 10000 /1000 + num % 100000 /10000 + num % 1000000 / 100000;
        System.out.println(total);
    }
}
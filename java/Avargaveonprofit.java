import java.util.Scanner;
public class Avargaveonprofit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me five numbers!");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        int avg = sum/5;

        System.out.println("Sum: " + sum + ", " + "Average: " + avg);
    }
}

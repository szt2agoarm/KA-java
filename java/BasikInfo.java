import java.util.Scanner;

public class BasikInfo {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Write down your name: ");    
    String name = scan.nextLine();

    System.out.println("Write down your age: ");
    int age = scan.nextInt();

    System.out.println("Write down your height(meters): ");
    double height = scan.nextDouble();

    System.out.println("Are you married?(true/false) ");
    boolean ifMarried = scan.nextBoolean();

    System.out.print("Your name is " + name + ", " + age + " years old, " + height + "meters tall and ");
    if (ifMarried = true){
        System.out.print("you are married!");
    } else{
        System.out.print("you are single!");
    }

}
}

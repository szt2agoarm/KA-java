import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Enter the number of chickens!");
        int chickenCount = scan.nextInt();

        System.out.println("Enter the number of pigs!");
        int pigCount =scan.nextInt();

        int totalChickenLegCount = 2 * chickenCount;
        int totalPigLegCount = 4 * pigCount;

        int totalLegs = totalChickenLegCount + totalPigLegCount;

        System.out.println("The number of legs: " + totalLegs + ".");
    }
}

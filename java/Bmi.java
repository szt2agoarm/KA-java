import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lets count your Bmi!");
        
        System.out.println("Tell me your weight in kgs.");
        double weightINkg = scan.nextDouble();

        System.out.println("Tell me your height in meters.");
        double heightINM = scan.nextDouble();

        double bmi = weightINkg / Math.pow(weightINkg, 2);
        
        if (bmi < 18.5){
           System.out.println("Your Bmi count is: " + bmi + ", you are slim.");
        } else if(bmi > 18.5 && bmi < 24.9){
            System.out.println("Your Bmi count is: " + bmi + ", you are average.");
        } else if(bmi > 25 && bmi < 29.9){
            System.out.println("Your Bmi count is: " + bmi + ", you are overweight.");
        }
    }
}

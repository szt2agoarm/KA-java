import java.util.Scanner;

public class DrawDiagona {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the square size from the user
        System.out.print("Please enter the square size: ");
        int squareSize = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        if (squareSize < 2) {
            System.out.println("Square size should be greater than or equal to 2.");
        } else {
            // Call the method to draw the square
            drawSquareWithDiagonal(squareSize);
        }
    }

    // Function to draw a square with the main diagonal of the specified size
    public static void drawSquareWithDiagonal(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - 1 - j || i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

import java.util.Scanner;

public class IT24104300Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
 
        if (number < 10000 || number > 99999) {
            System.out.println("Error! Enter a valid five-digit number.");
        } else {
            // Separate each digit with a space
            System.out.printf("%d %d %d %d %d%n",
                    (number / 10000),          // First digit
                    (number / 1000) % 10,      // Second digit
                    (number / 100) % 10,       // Third digit
                    (number / 10) % 10,        // Fourth digit
                    (number % 10));            // Fifth digit
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class IT24104300Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print(" kilograms you want to buy: ");
        double quantityKg = scanner.nextDouble();

        double totalAmount = pricePerKg * quantityKg;
        double Discount = totalAmount * 0.1;
        double Afterdiscount = totalAmount - Discount;

        System.out.printf("The Discounnted amount:" +Afterdiscount);

        scanner.close();
    }
}



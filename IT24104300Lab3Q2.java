import java.util.Scanner;

public cla{
    public static void main(String[] args) 
 {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print(" Monthly salary: ");
        double monthlySalary = scanner.nextDouble();

      
        System.out.print(" OT hours: ");
        int otHours = scanner.nextInt();

       
        System.out.print(" OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        double otAmount = otHours * otHourlyRate;

        double totalSalary = monthlySalary + otAmount;

       
        System.out.printf("The OT amount is: %.2f%n", otAmount);
        System.out.printf("The total salary is: %.2f%n", totalSalary);

        scanner.close();
    }
}

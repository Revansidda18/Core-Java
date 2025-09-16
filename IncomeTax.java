import java.util.Scanner;
class IncometaxCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your annual salary: ₹");
        double salary = scanner.nextDouble();

        double tax = 0;

        if (salary <= 250000)
        {
            tax = 0;
        } 
        else if (salary <= 500000) 
        {
            tax = 0.05 * (salary - 250000);
        } 
        else if (salary <= 1000000)
        {
            tax = 12500 + 0.20 * (salary - 500000);
        }
        else
        {
            tax = 112500 + 0.30 * (salary - 1000000);
        }
        System.out.println("Income Tax Payable: ₹" + tax);
    }
}

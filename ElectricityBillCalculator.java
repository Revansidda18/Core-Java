import java.util.Scanner;
class ElectricitybillCalculator 
	{
    public static void main(String[] args) 
		{
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter electricity units consumed: ");
        int units = s.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 300) {
            bill = 100 * 2 + (units - 100) * 3;
        } else {
            bill = 100 * 2 + 200 * 3 + (units - 300) * 5;
        }

        System.out.println("Total Bill: ₹" + bill);

       
    }

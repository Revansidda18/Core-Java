import java.util.Scanner;
class GreatestNumInTwoNum
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Number");
		
		int a =s.nextInt(), b=s.nextInt();
		
		int res= a>b? a : b;
		System.out.println(res + " is Greater ");
	}
}

import java.util.Scanner;
class SubtractionOfTwoNumbers
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		
		int a =s.nextInt(), b=s.nextInt();
		
		int res = a-b;
		
		System.out.println(a+ "-" + b + "=" + res);
	}
}

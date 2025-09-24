import java.util.Scanner;
class NumberIsEvenOrOdd
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a num");
		
		int n =s.nextInt();
		
		String res= n%2==0? n + " is Even Number" : + n + " is Odd Number " ;
		System.out.println(res);
	}
}

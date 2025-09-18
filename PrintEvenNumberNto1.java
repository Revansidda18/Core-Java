import java.util.Scanner;
class PrintEvenN_1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int start=s.nextInt(), end=1;
		while(start>=end)
		{
			if(start%2==0)
			{
				System.out.pritnln(start++);
			}
		}
	}
}

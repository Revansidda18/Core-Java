import java.util.Scanner;
class PrintAllOddDigits 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter n value");
		int n=s.nextInt();
		while(n!=0)
		{
			int last=n%10;
			if (last%2==1)
			System.out.println(last);
			n/=10;
			}
	}
}

import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter n value");
	int start=2,n=s.nextInt(),fact=1;
	
	while(start<=n)
		{
		fact=fact*start;
		start++;
		}
		
		System.out.println("factorial of" + n + "is:"+fact);
	}
}

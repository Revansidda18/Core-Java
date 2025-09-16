import java.util.Scanner;
class Digit
{
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
	int n=s.nextInt(), count=0;
	while(n!=0)
		{
		count++;
		n/=10;
		}
		System.out.println(count);
	}
}

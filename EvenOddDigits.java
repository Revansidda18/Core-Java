import java.util.Scanner;
class EvenOddDigits
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt(),ec=0,oc=0;
		while(n!=0)
		{
			int last=n%10;
			if(last%2==0)
				ec++;
			else
				oc++;
			n/=10;
		}
		System.out.println("count of even digit is : "+ec);
		System.out.println("count of odd digit is : "+oc);
	}
}

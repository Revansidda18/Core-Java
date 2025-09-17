Harshad Number 
- Defination : A postive integer that is divisible by its own sum of numbers.
  
- Example : 18, 24, 81, 153
  18 : 1+8 = 9 ( 18 is divisible by 9 , so it is Harshad Number)

  
import java.util.Scanner;
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt(),sum=0,temp=n;
		while(temp!=0
         
		{
			int last=temp%10;
			sum+=last;
			temp/=10;
		}
		
		System.out.println(n%sum==0?n+ "is harshad number": + n + "is not harshad number");
	}
}

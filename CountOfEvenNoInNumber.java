import java.util.Scanner;
class CountEven  
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int start=1, end=s.nextInt(),count=0;
		while(start<=end)
		{
			if(start%2==0)
			{
				count++;
			}
		start++;
		}
		System.out.println(count);
	}
}

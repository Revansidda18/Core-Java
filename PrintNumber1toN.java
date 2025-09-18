import java.util.Scanner;
class Number_N 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int start=1, end=s.nextInt();
		while(start<=end)
			System.out.println(start++);
	}
}

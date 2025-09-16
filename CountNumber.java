import java.util.Scanner;
class Count
{
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
	int start=1, end=s.nextInt(), count=0;
	while(start<=end)
	{
		count++;
		start++;
	}
		System.out.println(count);
	}
}

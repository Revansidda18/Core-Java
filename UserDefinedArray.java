import java.util.Scanner;
class UserDefinedArray 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=s.nextInt();
		int arr[]=new int[size];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(" Enter " + (i+1) + " Element " );
			arr[i]=s.nextInt();
		}
		
		System.out.println("Array elements are");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}

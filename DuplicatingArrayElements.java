import java.util.Scanner;
import java.util.Scanner;
class DuplicateArray
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Original Array : " + Arrays.toString(arr));
		
		int dupArr[] = new int[arr.length];
		for(int i=0; i<dupArr.length; i++)
		{
			dupArr[i]=arr[i];
		}
		System.out.println("Duplicate Array : " + Arrays.toString(dupArr));

	}
}


//output :- 
  // Enter size of Array
// 5
// 10
// 5
// 18
// 45
// 17
// original Array : [10, 5, 18, 45, 17]
// Duplicate Array : [10, 5, 18, 45, 17]

import java.util.*;

class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int size = s.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < arr.length; i++)
			      {
            arr[i] = s.nextInt();
            }

        System.out.println("Original Array: " + Arrays.toString(arr));

        int revArr[] = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--)
		      	{
            revArr[j] = arr[i];
            j++;
            }

        System.out.println("Reversed Array: " + Arrays.toString(revArr));
    }
}



// OutPut :-
Enter size of array:
4
Enter 4 elements:
1
2
3
4
Original Array: [1, 2, 3, 4]
Reversed Array: [4, 3, 2, 1]

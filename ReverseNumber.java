import java.util.Scanner;
class ReverseNumber
  {
    public static void main (String [] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a Number");
      int n = s.nextInt();
      int rev=0;

    for(int temp=n; temp!=0; temp/=10)
      {
        int last = temp%10;
        rev = rev*10+last;
      }
      System.out.println(" Reverse Of a Number " + n + " is : " + rev);
    }
  }

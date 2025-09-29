Prime Number := a number is divisible by 1 and it self called Prime Number.
  Example:= 1,2,3,5,7,11,etc.....

  import java.util.Scanner;
  class PrimeNumber
    {
      public static void main(String [] args)
      {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(), count=0;

      for(int i=1; i<=n; i++)
        {
          if(n%i==0)
            count++;
        }

      if(count==2) {
        System.out.println(n+ " is Prime Number"); }
        else
        System.out.println(n+ " is Prime Not Number");
      }
    }

import java.util.Scanner;
class SumOfFactors
  {
    public static void main(String [] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a Number");
      int n = s.nextInt(), sum=0;

    for(int i=1; i<=n; i++)
      {
        if(n%i==0)
        {
          sum=+i;
        }
      }
      System.out.println("Sum of Factors" + n + " is " + sum);
    }
  }

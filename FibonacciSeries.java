import java.util.Scanner;
class FibonacciSeries
{
    public static void main(String[] args) 
  {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
    
        int n = s.nextInt(), a=0, b=1, sum=0;
    
        System.out.print(a + " " + b);

for(int i=2; i<=n; i++)
  {
    sum=a+b;
    System.out.println(" " + sum);
     a = b;
     b = sum;
  }
 }
}

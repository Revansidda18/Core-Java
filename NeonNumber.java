import java.util.Scanner;
class NeonNumbwr
  {
    public static void main(String [] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a Number");

      int n = s.nextInt();
      int sq = n*n;
      int sum=0;

      while(sq!=0)
        {
         int last = sq%10;
         sum = sum + last;
          sq/=10;
        }
      
      System.out.println(sum==n ? n + " is Neon number" : n + "is not Neon Number");
    }
  }
          
      
  

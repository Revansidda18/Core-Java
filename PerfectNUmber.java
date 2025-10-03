Perfect Number :- A number is square of a another integer than it is perfect square.
  example:- 1,4,9,16,25,36
  
  
  
  import java.util.Scanner;
   class PerfectNumber
   {
     public static boolean isPerfectNumber(int n)
     {
       for(int i=1; i<=n; i++)
         {
           if(i*i==n)
             return true;
         }
       return false;
     }
     public static void main (String [] args)
     {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = s.nextInt();

       if(isPerfectNumber(n)==true)
         System.out.println(n+ " is Perfect Number");
       else
          System.out.println(n+ " is Not Perfect Number");
     }
   }
         
         

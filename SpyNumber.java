/* Spy Number :- Sum of digits and product of digits are same than it is a spy number.
   example: 123
   1+2+3=6,
   1*2*3=6.  */

import java.util.Scanner;
class SpyNumber
{
  public static void main (String [] args)
  {
     Scanner s = new Scanner(System.in);
    System.out.println("Enter a Number");
    int n = s.nextInt();
    int sum=0;
    int prod=1;

  while(n!=0)
    {
    int last =  n%10;
      sum = sum+last;
      prod=prod*last;
      n/=10;
    }
    System.out.println(sum==prod?  " is Spy Number " :  "is not Spy Number");
  }
}

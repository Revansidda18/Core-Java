Sunny Number:- A Sunny Number is a positive integer where the number immediately succeeding it (N+1) is a perfect square.

  example = N+1,
  N=3,      3+1=4 , then 3 is a Sunny Number.
  Examples:- 80, 63, 48, 35, etc.....
  

import java.util.Scanner;
class SunnyNumber
  {
    public static void main(String [] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a Number");
      int n=s.nextInt();
      int res=n+1;
      boolean isSunny=false;

    for(int i=1;i*i<=res; i++)
      {
        if(i*i==res)
          isSunny=true;
      }
      System.out.println(isSunny ? n + " is Sunny Number " : n + " is Not Sunny Number ");
    }
  }

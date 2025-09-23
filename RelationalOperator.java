Relational Operatorm 
  defination :- in java it is a binary operator , it is used to check the conditions.

 ** return type of Relational Operators are Boolean ( true or false). **

  Example : 

import java.util.Scanner;
class RelationalOperator
  {
    public static void main (String [] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter Two Numbers");
      
      int a=s.nextInt(), b=s.nextInt();
      
       System.out.println(a>b);
       System.out.println(a<b);
       System.out.println(a>b);
       System.out.println(a<=b);
       System.out.println(a==b);
       System.out.println(a!=b);
    }
  }

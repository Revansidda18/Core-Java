Compound Assignment Operator

Defination :- In java it used to perform first arithematic operation, and result will be stored inside variable.

  Example : 

class CompoundAssignmentOperator
  {
    public static void main (String [] args)
    {
      int a = 18;
      System.out.println(a);            // 12
      
    a+=15;
        System.out.println(a);          // 33
      
    a-=10;
        System.out.println(a);          // 23
      
    a*=2;
        System.out.println(a);          // 46
      
    a/=2;
        System.out.println(a);          // 23
      
    a%=1;
        System.out.println(a);          // 1
    }
  }

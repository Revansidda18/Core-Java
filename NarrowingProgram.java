import java.util.Scanner;
class Narrowing 
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a Number");

    double d = s.nextDouble();

    int i = (int)d;
    long l = (long)d;
    short s = (short)d;

     System.out.println(d);
      System.out.println(i);
      System.out.println(l);
      System.out.println(s);

  }
}
    
    
  

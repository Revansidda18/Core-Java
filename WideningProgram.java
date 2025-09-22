import java.util.Scanner;
class Widening 
{
  public static void main (String [] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a Number");
    
    int i = s.nextInt();
    
    long l = i;
    float f = i;
    double d = i;
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    
  }
}
    

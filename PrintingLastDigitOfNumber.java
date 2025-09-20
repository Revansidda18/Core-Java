import java.util.Scanner;

class LastDigit 
{
  public static void main(String [] args)
  {
    Scanner s = new Scammer(System.in);
    System.out.println("Enter a  Number");

  int n = s.nextInt();

  int last = n%10;
    System.out.println( "last digit of " + n +  " is :  " + last );
  }
}

Example => input - 765, output - 7.


import java.util.Scanner;
class FirstDigit{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a Number");
    int n=s.nextInt();
    if(n<0)
    {
      n=-n;
    }
    while(n>=10)
    {
      n/=10;
    }
    System.out.println("first digit of " + n);
  }
}


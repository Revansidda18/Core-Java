import java.util.Scanner;
class GreatestNoAmongTwoNumber
{  
public static void main(String [] args)
  {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Two Numbers");
    int a = s.nextInt(), b=s.nextInt();
    
    if(a>b)
    
    System.out.println( a + " is Greater" );
	
    else 
		
    System.out.println(  b + " is Greater" );
  
  }
}

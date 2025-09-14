import java.util.Scanner;
class Academic Performance 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Student CGPA");
		System.out.println("Enter Student Annual family income");
		
	Double CGPA= s.nextDouble();
	Double Income= s.nextDouble();
	if (CGPA>=9.0 && income<200000)
		System.out.println("full Scholarship");
	else if (CGPA>=8.0 && income<500000);
		System.out.println("Half Scholarship");
	esle 
		System.out.println("No scholarship");
	
	}
}

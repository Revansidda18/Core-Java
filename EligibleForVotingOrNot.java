import java.util.Scanner;
class EligibleForVotingOrNot
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int n = s.nextInt();
		
		String vote = n>18 ? n + " is Eligible For Voting " : n + " is Not Eligible for Voting" ;
		System.out.println(vote);
	}
}

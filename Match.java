import java.util.Scanner;

class Match
{
	public static void main(String arg[])
	{	
		int India, Pak;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter run for India :");
		India = sc.nextInt();
		System.out.println("Enter run for Pakistan :");
		Pak = sc.nextInt();
		
		if(India>Pak)
		{
			System.out.println("India  won the match");
		}
		else
		{
			System.out.println("Pakistan won the match");
		}
		sc.close();
	}
}	
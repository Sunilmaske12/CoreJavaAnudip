import java.util.Scanner;

class Match2
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
		else if(India<Pak)
		{
			System.out.println("Pakistan won the match");
		}
		else System.out.println("Match has been tie");
		sc.close();
	}
}	
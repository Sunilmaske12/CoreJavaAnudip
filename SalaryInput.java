import java.util.Scanner;

class SalaryInput
{
	public static void main(String arg[])
	{	
		int sal;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary:");
		sal= sc.nextInt();
				
		if(sal >=100000)
		{
			System.out.print("My family is happy with me " );
		}
		else if(sal >=75000)
		{
			System.out.print("I have better life" );
		}
		else if(sal >=50000)
		{
			System.out.print("I am happy" );
		} 
		else System.out.print("Unsatisfied Life" );
		
		sc.close();
	}
}	
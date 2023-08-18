import java.util.Scanner;
class MySal
{
	public static void main(String arg[])
	{
	    int basicSal;
	    float da;
	     double hra, gross;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic Salary");
		basicSal = sc.nextInt();
		System.out.println("Enter daily allowance");
		da = sc.nextFloat();
		System.out.println("Enter hra");
		hra = sc.nextDouble ();

		gross = basicSal+da+hra;
		System.out.println("Total gross salary is "+gross);

		sc.close();
		
	}
}
import java.util.Scanner;

class IfDemo
{
	public static void main(String arg[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		if(num>0)
		{
			System.out.println("Welcome to java programing");
		}
		System.out.println("Enjoy programming");
	sc.close();
	}
}	
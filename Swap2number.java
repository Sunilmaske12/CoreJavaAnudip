import java.util.Scanner;
class Swap2number
{
	public static void main(String arg[])
	{
	
	Scanner sc=new Scanner(System.in);
	    int A;
	    int B;
	    int temp;

	System.out.println("Enter value for A :");
	 A = sc.nextInt();
	System.out.println("Enter value for B :");
	B = sc.nextInt();
	
	temp = A;
	A=B;
	B=temp;
	
	System.out.println("A :"+A);
	System.out.println("B :"+B);

		sc.close();
		
	}
}
import java.util.Scanner;

class SimpleIntrest2 {
	
	public static void main(String[] arg){		
	
	Scanner sc=new Scanner(System.in);
	double p, r, t, si;

	
	System.out.println("Enter principal amount");
	
	p = sc.nextDouble();

	System.out.println("enter percentage rate ");

	r= sc.nextDouble();

	System.out.println("enter time in years ");

	t= sc.nextDouble();
	
	si= p*r*t/100;

	System.out.println("Simple intrest is "+si);

	

	}
 }
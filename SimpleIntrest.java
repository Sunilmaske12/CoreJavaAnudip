import java.util.Scanner;

class SimpleIntrest {
	
	public static void main(String[] arg){		
	
	Scanner sc=new Scanner(System.in);
	int p, r, t, si;
	
	
	
	System.out.println("enter principal amount");
	
	p = sc.nextInt();

	System.out.println("enter percentage rate ");

	r= sc.nextInt();

	System.out.println("enter time in years ");

	t= sc.nextInt();
	
	si= p*r*t/100;

	System.out.println("Simple intrest is "+si);

	

	}
 }
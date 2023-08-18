import java.util.Scanner;

class ArithematicOp{
	
	public static void main(String[] arg){		
	
	Scanner sc=new Scanner(System.in);
	int num1, num2, res;
	
	
	
	System.out.println("enter 2 numbers");
	
	num1 = sc.nextInt();

	num2 = sc.nextInt();



	
	res = num1+num2;
	System.out.println("Addition of numbers is "+res);

	res = num1-num2;
	System.out.println("SUbstraction of numbers is "+res);

	res = num1*num2;
	System.out.println("Multiplication of numbers is "+res);

	res = num1/num2;
	System.out.println("Division of numbers is "+res);
	
	res = num1%num2;
	System.out.println("Remaindes of numbers is "+res);	



	}
 }
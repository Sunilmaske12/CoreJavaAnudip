

// Calculator. using switch cases
import java.util.Scanner;

class Calculator
{
	public static void main(String arg[])
	{
		float  num1, num2;
		int op;
		Scanner sc=new Scanner(System.in);		
		System.out.println("1. Addition ");
		System.out.println("2. Substraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("\n Select Operations ");
		op = sc.nextInt();
		 switch(op){
			case 1: 
				System.out.println("\nEnter two numbers :");
				num1 = sc.nextFloat();
				num2 = sc.nextFloat();
				System.out.print(num1+" + "+num2+" = "+(num1+num2)); 
				break;
			case 2: 
				System.out.println("\nEnter two numbers :");
				num1 = sc.nextFloat();
				num2 = sc.nextFloat();
				System.out.print(num1+" - "+num2+" = "+(num1-num2)); 
				break;
			case 3: 
				System.out.println("\nEnter two numbers :");
				num1 = sc.nextFloat();
				num2 = sc.nextFloat();
				System.out.print(num1+" / "+num2+" = "+(num1/num2)); 
				break;
			case 4: 
				System.out.println("\nEnter two numbers :");
				num1 = sc.nextFloat();
				num2 = sc.nextFloat();
				System.out.print(num1+" * "+num2+" = "+(num1*num2)); 
				break;
			 default: System.out.print("Invalid input"); 
				break;
			}
	}
}
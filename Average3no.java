import java.util.Scanner;

class Average3no {
	
	public static void main(String[] arg){		
	
	Scanner sc=new Scanner(System.in);
	int num1, num2, num3, avg;
	
	
	
	System.out.println("Enter 3 numbers");
	
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	
	
	avg= (num1+num2+num3)/3;

	System.out.println("Average of 3 numbers is "+avg);

	

	}
 }
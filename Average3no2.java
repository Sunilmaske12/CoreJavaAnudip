import java.util.Scanner;

class Average3no2 {
	
	public static void main(String[] arg){		
	
	Scanner sc=new Scanner(System.in);
	Double num1, num2, num3, avg;
	
	
	
	System.out.println("Enter 3 numbers");
	
	num1 = sc.nextDouble();
	num2 = sc.nextDouble();
	num3 = sc.nextDouble();
	
	
	avg= (num1+num2+num3)/3;

	System.out.println("Average of 3 numbers is "+avg);

	

	}
 }
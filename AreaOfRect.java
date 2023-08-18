import java.util.Scanner;

class AreaOfRect{
	
	public static void main(String[] arg){		
	
	Scanner sc=new Scanner(System.in);
	int length, breadth, area;
	
	
	
	System.out.println("enter length and breadth");
	
	length = sc.nextInt();

	breadth = sc.nextInt();
	
	area = length*breadth;

	System.out.println("Area of rectangle is "+area);

	

	}
 }
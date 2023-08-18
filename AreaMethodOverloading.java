import java.util.Scanner;
public class AreaMethodOverloading
{
	
	double area(double side)
	{
		return side*side;
	}
	double area(double len, double bre)
	{
		return len*bre;
	}
	double area(float rad)
	{
		return 3.14*rad*rad;
	}

	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		double side, len, bre;
		float rad;
	
		System.out.println("Enter side of square :");
		side = sc.nextDouble();
		System.out.println("Enter length and breadth of rectangle:");
		len  = sc.nextDouble();
		bre  = sc.nextDouble();
		System.out.println("Enter radius of circle:");
		rad  = sc.nextFloat();
		
		 AreaMethodOverloading obj=new   AreaMethodOverloading();
		System.out.println("\n\nArea of Square is: "+obj.area(side));
		System.out.println("Area of Rectangle is: "+obj.area(len, bre));
		System.out.println("Area of Circle is: "+obj.area(rad));
		

	}
}

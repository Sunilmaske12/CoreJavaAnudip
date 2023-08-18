import java.util.Scanner;
class Static2
{
	static double pi=3.14;
	int rad;
	double area;
	Scanner sc=new Scanner(System.in);
	public static void accept()
	{
		System.out.println("Hello");
	}
	public void cal()
	{
		System.out.println("Enter radius");
		rad=sc.nextInt();
		area = pi*rad*rad;
		System.out.println("Area  : "+area);
	}

	public static void main(String[] arg)
	{
		Static2 s=new Static2();
		Static2.accept();
		s.cal();
	}
}

import java.util.Scanner;
class Base
{
	int n1, n2, res;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter 2 number :");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
	}
}

class D1 extends Base
{
	public void cal()
	{
		res = n1+n2;
	}
}

class D2 extends D1
{
	public void display()
	{
		System.out.println("Result is :"+res);
	}
}
public class MultiLevelInheritance
{
	public static void main(String[] arg)
	{
		D2 obj=new D2();
		obj.input();
		obj.cal();
		obj.display();
	}
}
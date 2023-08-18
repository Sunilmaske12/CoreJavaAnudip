import java.util.Scanner;

class Oop1
{
	double num1, num2, ans;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	public void addNum()
	{
		ans = num1+num2;
		System.out.println("The addition is "+ans);
	}
	public void subNum()
	{
		ans = num1-num2;
		System.out.println("The substraction is "+ans);
	}
	public void mulNum()
	{
		ans = num1*num2;
		System.out.println("The multiplication is "+ans);
		addNum();
	}
	public void divNum()
	{
		ans = num1/num2;
		System.out.println("The division is "+ans);
	}
}

public class Main
{
	public static void main(String arg[])
	{
		Oop1 obj=new Oop1();
		obj.input();
		obj.addNum();
		obj.mulNum();
	}
}

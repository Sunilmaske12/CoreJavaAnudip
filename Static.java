class Demo 
{
	int res;
	int add(int a, int b)
	{
		return a+b;
	}
	static int multiply(int a, int b)
	{
		return a*b;
	}
	double div(int a, int b)
	{
		return a/b;
	}
}
public class Static
{
	public static void main(String[] arg)
	{
		Demo d=new Demo();
		d.add(2,3);
		System.out.println("Multiplication  : "+Demo.multiply(2,3));
		System.out.println("Division  : "+d.div(2,3));
	}
}

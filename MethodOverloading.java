public class MethodOverloading
{
	int add(int a, int b)
	{
		return a+b ;
	}

	double add(int a, int b, double c)
	{
		return a+b+c ;
	}

	int add(int a, int b, int c, int d )
	{
		return a+b+c+d ;
	}

	public static void main(String[] arg)
	{
		MethodOverloading b=new MethodOverloading();
		System.out.println("Result : "+b.add(2, 3));
		System.out.println("Result : "+b.add(2, 3, 4.5));
		System.out.println("Result : "+b.add(2, 3, 4, 5));
	}	
}
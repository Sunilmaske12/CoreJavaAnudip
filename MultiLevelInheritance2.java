class Father
{
	public void move()
	{
		System.out.println("I can walk with the help of stick.");
	}
}
//Son  inherite  Father
class Son extends Father
{
	// eat() method override
	@Override
	public void move()
	{
		System.out.println("I can run fast");
		super();
	}	
}
//Baby  inherite Son
class Baby extends Son
{
	// eat() method override
	@Override
	public void move()
	{
		System.out.println(" I can Nicely crawl");
	}	
}

public class MultiLevelInheritance2
{
	public static void main(String[] arg)
	{
		
	}	
}
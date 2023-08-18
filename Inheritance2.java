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
	// move() method override
	@Override
	public void move()
	{
		super.move();
		System.out.println("I can run fast");
		
	}	
}
//Baby  inherite Son
class Baby extends Son
{
	//move() method override
	@Override
	public void move()
	{
		super.move();
		System.out.println(" I can Nicely crawl");
	}	
}

public class Inheritance2
{
	public static void main(String[] arg)
	{
		Baby b=new Baby();
		b.move();
	}	
}
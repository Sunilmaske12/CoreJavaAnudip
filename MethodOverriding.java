class Animal
{
	public void eat()
	{
		System.out.println("I can eat");
	}
}
//Dog inherite Animal
class Dog extends Animal
{
	// eat() method override
	@Override
	public void eat()
	{
		System.out.println("Dog can eat");
	}

	//new method
	public void bark()
	{
		System.out.println("Dog can bark");
	}
	
}

public class MethodOverriding
{
	public static void main(String[] arg)
	{
		Dog obj=new Dog();
		obj.eat();
		obj.bark();
	}	
}
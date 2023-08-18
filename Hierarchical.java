import java.util.Scanner;
class Doctor
{
	void m()
	{
		System.out.println("I am a doctor");
	}
}

class Surgeon extends Doctor
{
	@Override
	void m()
	{
		super.m();
		System.out.println("I am a Surgeon");
	}
}

class Nurse extends  Doctor
{
	@Override
	void m()
	{
		System.out.println("I am a Nurse");
	}
}

public class Hierarchical
{
	public static void main(String[] arg)
	{
		Doctor s=new Surgeon();
		Doctor n=new Nurse();
		s.m();
		n.m();
	}
}

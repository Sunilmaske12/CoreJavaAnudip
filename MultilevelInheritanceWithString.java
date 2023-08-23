//WAP to implement multilevel inheritance to perform different operations in String
import java.util.*;


class Field
{
	String str1;
	String str2;

}


class Operation extends Field
{
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter 2 string");	
		str1 = sc.next();
		str2 = sc.next();
		
	}

	void operation()
	{
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();

		int i = str1.compareTo(str2);
		if(i==0) System.out.println("Both Strings are equal");
		else System.out.println("Both Strings are not equal\n");
		
		System.out.println(str1+str2);
	}

	void display()
	{
		System.out.println(str1);
		System.out.println(str2);
	}
}


public class MultilevelInheritanceWithString extends Operation 
{
	public static void main(String[] arg)
	{
		MultilevelInheritanceWithString mlh=new MultilevelInheritanceWithString();
		mlh.input();
		mlh.display();
		mlh.operation();
		mlh.display();
	}
}
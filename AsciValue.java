//WAP to enter a letter and change the case of that letter and print the ASCII value
import java.util.*;


public class AsciValue
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		char c1, c2;
		System.out.println("Enter a character");
		c1=sc.next().charAt(0);
		
		if(Character.isUpperCase(c1)==true)
		{
			c2 = Character.toLowerCase(c1);
		System.out.println("lower case :"+c2);
		System.out.println("Asci value "+(int)c2);
		}
		else
		{
			c2 = Character.toUpperCase(c1);
		System.out.println("Upper case :"+c2);
		System.out.println("Asci value "+(int)c2);
		}
	}
}
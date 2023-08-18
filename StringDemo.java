

import java.util.Scanner;

class StringDemo
{
	public static void main(String arg[])
	{
		String str1, str2="hello";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a name   ");
		str1 = sc.next();

		System.out.println("Welcome : "+str1);
		System.out.println(str2);
		
		if(str1.equals(str2))
		{
			System.out.println("Both the strings are equals ");
		}
		
	}
}
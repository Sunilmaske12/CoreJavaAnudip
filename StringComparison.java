import java.util.*;

public class StringComparison
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 String");
		String str1 = sc.next();
		String str2 = sc.next();

		int i = str1.compareTo(str2); //it return o value when both string are equal

		System.out.println(i);
		if(i==0) System.out.println("Both Strings are equal");
		else System.out.println("Both Strings are not equal\n");
		
		System.out.println(str1.toLowerCase());		
		

	}
}
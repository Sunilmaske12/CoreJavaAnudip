//WAP program to accept a number and check whether it is less than 100,greater than 50 else greater than 100
import java.util.Scanner;
class NestedLoop1
{
	public static void main(String arg[])
	{	
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num= sc.nextInt();
		if(num<100)
			{
			if(num>50)
				{
					System.out.println(num+" is greater than  50");
				}	
			}
		else 
			{
				System.out.println(num+" is greater than or equal to 100");
			}						
	}
}	
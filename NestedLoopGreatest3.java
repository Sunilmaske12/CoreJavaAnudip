// Wap to accept age and weight and make a decision whether he can donate a blood or not
// If the person is above 18 years of age then use another if statement to check if the weight of the person is above 50 or not.
import java.util.Scanner;
class NestedLoopGreatest3
{
	public static void main(String arg[])
	{	
		int n1, n2, n3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 numbers : ");
		n1= sc.nextInt();
		n2= sc.nextInt();
		n3= sc.nextInt();
		if(n1>n2)
			{
			if(n1>n3)
				{
					System.out.println(n1+ "is greater");
				}
			}
		else	
			{
			 if(n2>n3)
				{
					System.out.println(n2+ "is greater");
				}
			else
				{
					System.out.println(n3+ "is greater");
				}
			}
		
		sc.close();						
	}
}	
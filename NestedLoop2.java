// Wap to accept age and weight and make a decision whether he can donate a blood or not
// If the person is above 18 years of age then use another if statement to check if the weight of the person is above 50 or not.
import java.util.Scanner;
class NestedLoop2
{
	public static void main(String arg[])
	{	
		int age, weight;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a age : ");
		age= sc.nextInt();
		System.out.print("Enter a weight : ");
		weight= sc.nextInt();
		if(age>18)
			{
			if(weight>50)
				{
					System.out.println("He can donate the blood");
				}
			else
				{
					System.out.println("He not eligible to donate the blood");
				}	
			}
		else 
			{
				System.out.println("He not eligible to donate the blood");
			}						
	}
}	
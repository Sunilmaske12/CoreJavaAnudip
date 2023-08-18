// it is used for menu driven program
/* switch(ch){
	case 1: body;
	           break;
	case 1: body;
	           break;
	case 1: body;
	           break;
	
	default: body;
	           break;
	} */

// WAP to make decision of weekly day off
import java.util.Scanner;

class SwitchCases
{
	public static void main(String arg[])
	{
		int  num;
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter a number between 1 to 7 : ");
		num = sc.nextInt();
		 switch(num){
			case 1: System.out.print("Your weekly of is Monday"); ;
				break;
			case 2: System.out.print("Your weekly of is Tuesday"); ;
				break;
			case 3: System.out.print("Your weekly of is Wednesday"); ;
				break;
			case 4: System.out.print("Your weekly of is Thursday"); ;
				break;
			case 5: System.out.print("Your weekly of is Friday"); ;
				break;
			case 6: System.out.print("Your weekly of is Saturday"); ;
				break;
			case 7: System.out.print("Your weekly of is Sunday"); ;
				break;
			 default: System.out.print("Invalid input"); ;
				break;
			}
	}
}
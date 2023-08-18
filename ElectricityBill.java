/* 
	unit <=100  ==> 10rs
	unit <=200  ==> 15rs
	unit <=300  ==> 20rs
	unit >300  ==> 25rs  */
import java.util.Scanner;

class ElectricityBill
{
	public static void main(String arg[])
	{	
		int unit, totalBill;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total units:");
		unit = sc.nextInt();
				
		if(unit <=100)
		{
			totalBill = unit*10;
			System.out.print("Your total bill is Rs.:"+totalBill );
		}
		else if(unit <=200)
		{	
			totalBill = 100*10 +  (unit-100)*15;
			System.out.print("Your total bill is Rs.:"+totalBill );
		}
		 else if(unit <=300)
		{
			totalBill = 100*10+ 100*15 +  (unit-200)*20;
			System.out.print("Your total bill is Rs.:"+totalBill );
		}
		else 
		{
			totalBill =100*10 + 100*15+ 100*20+ (unit-300)*25;
			System.out.print("Your total bill is Rs.:"+totalBill );
		}
		sc.close();
	}
}	
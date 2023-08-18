import java.util.Scanner;

class Oop3
{
	String name, city, state;
	int rollNo, age, pincode;
	Scanner sc=new Scanner(System.in);
	
	void info()
	{
		System.out.println("\n Name : "+name);
		System.out.println("Roll No. : "+rollNo);
		System.out.println("Age : "+age);
	}

	void input()
	{
		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.print("Enter Roll No : ");
		rollNo = sc.nextInt();
		System.out.print("Enter Age: ");
		age = sc.nextInt();
	}
	
	void addAddress()
	{
		System.out.print("\n Enter City : ");	
		city = sc.next();
		System.out.print("Enter State : ");	
		state = sc.next();

		System.out.print("Enter Pincode : ");	
		pincode = sc.nextInt();
	}
	void showAddress()
	{
 		System.out.print("\n Enter Name : "+name);	
		System.out.print("Enter City : "+city);	
		System.out.print("Enter State : "+state);	
		System.out.print("Enter Pincode : "+pincode);	
	}


}

public class Student
{
	public static void main(String arg[])
	{
		Oop3 obj=new Oop3();
		obj.input();
		obj.info();
		obj.addAddress();
		obj.showAddress();
	}
}

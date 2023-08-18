import java.util.Scanner;
class DirectAss
{
	String name;
	String address; 
	int age;
	
	Scanner sc=new Scanner(System.in);
	void tellName()
	{
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Name is : "+name);
	}
	void tellAddress()
	{
		System.out.println("Enter address : ");
		address=sc.next();
		System.out.println("Address is : "+address);
	}
	void tellAge()
	{
		System.out.println("Age is : ");
		age=sc.nextInt();
		System.out.println("Age is : "+age);
	}

	public static void main(String arg[])
	{
		DirectAss obj=new DirectAss();
		obj.name="Sunil";
		obj.address="Nagpur";
		obj.age=31;
		
		System.out.println("Name is : "+obj.name);
		System.out.println("Address is : "+obj.address);
		System.out.println("Age is : "+obj.age);

		obj.tellName();
		obj.tellAddress();
		obj.tellAge();
	}
}

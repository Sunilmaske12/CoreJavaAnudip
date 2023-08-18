import java.util.Scanner;
class PersonalInfo
{
	String name, address;
	int rollNo, math, eng, sci, total, per;
	Scanner sc=new Scanner(System.in);
	public void inputPersonal()
	{
		System.out.println("Enter your name :");
		name = sc.next();
		System.out.println("Enter your address :");
		address = sc.next();
	}
}

class MarksInfo extends PersonalInfo
{
	public void inputMarks()
	{
		System.out.println("Enter marks for Maths :");
		math = sc.nextInt();
		System.out.println("Enter  marks for English :");
		eng = sc.nextInt();
		System.out.println("Enter  marks for Science :");
		sci = sc.nextInt();
	}
}

class Result extends MarksInfo
{
	public void display()
	{
		System.out.println("\n\nName : Mr/Mrs."+name+"       Roll no :"+rollNo+ "\nAddress :"+address);
		System.out.println("\nSubjects : Marks");
		System.out.println("Maths         "+math);
		System.out.println("English       "+eng);
		System.out.println("Science       "+sci);
		total = math+eng+sci;
		per = total/3;
		System.out.println("Total Score out of 300 : "+total+" ( "+per+"%)");
		
	}
}
public class Marksheet
{
	public static void main(String[] arg)
	{
		Result obj=new Result();
		obj.inputPersonal();
		obj.inputMarks();
		obj.display();
	}
}
/*St.Xavier school displays a notice on the school notice board regarding admission in 11th for choosing stream according marks in english
	math, science in ICS examination
	eng,math,sci >= 80%		 ==>Pure science
	eng,sci>=80% and  math>=60%	 ==>Bio. Science
	eng,math,sci>=60%    		==>commerce   */

import java.util.Scanner;

class StreamDivision
{
	public static void main(String arg[])
	{	
		int sci, eng, math;
		Scanner sc=new Scanner(System.in);
		System.out.println("==========Admission Process=============");
		System.out.print("Enter marks for English:");
		eng = sc.nextInt();
		System.out.print("Enter marks for Maths:");
		math = sc.nextInt();
		System.out.print("Enter marks for Science :");
		sci = sc.nextInt();
		
		if(eng>= 80 && math>= 80 && sci >= 80)
		{
			System.out.println("You are eligible for Pure Science Stream");
		}
		else if(eng>=80 && sci>=80 && math>=60)
		{
			System.out.println("You are eligible for Bio Science Stream ");
		}
		else if(eng>= 60 && math>= 60 && sci>= 60)
		{
			System.out.println("You are eligible for Commerce Stream");
		}
		else 
		{
			System.out.println("You are not eligible for any Stream");
		}
		sc.close();
	}
}	
import java.util.*;

public class StringTokenizerClass
{
	public static void main(String[] arg)
	{
		StringTokenizer st=new	StringTokenizer("I am a student", " ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());

		}	

		StringTokenizer st2=new	StringTokenizer("I,am,a,student");
		System.out.println("\n"+st2.nextToken(",")+"\n");
		
		StringTokenizer st1=new	StringTokenizer("I,am,a,student", ",");
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());

		}	

	}
}
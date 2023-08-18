/*
* 	   *
**	 **
***            ***
****        ****
*****    *****
************
************
*****    *****
****        ****
***            ***
**                **
*	   *
*/

class StarPattern10{
	public static void main(String arg[])
	{	int r=6, c=12;
		for(int i=1; i<=r; i++)
			{
				c= c-2;
				for(int j=1; j<=i; j++)
				{
					System.out.print("*");
				}
				for(int j=c; j>=1; j--)
				{	
					System.out.print(" ");
				}
				for(int j=i; j>=1; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=r-1; i>=1; i--)
			{
				c= c+2;
				for(int j=1; j<=i; j++)
				{
					System.out.print("*");
				}
				for(int j=c; j>=1; j--)
				{	
					System.out.print(" ");
				}
				for(int j=i; j>=1; j--)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
		
	}



}
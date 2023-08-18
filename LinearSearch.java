import java.util.Scanner;
class LinearSearch
{
	int linearSearch(int num, int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==num)
			{	
				return i;
				
			}
			
		}	
		return -1;
	}

	public static void main(String arg[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element for array");
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		num=sc.nextInt();
		LinearSearch ls=new LinearSearch();
		int ans=ls.linearSearch(num, arr);
		System.out.println("Answer is "+ans);
	}
}
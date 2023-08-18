//WAP to generate prime numbers between 1 and 100

class PrintPrimeNum
{
	public static void main(String []arg)
	{
		boolean isPrime ;
		for(int i=2; i<100; i++)
		{	
			isPrime = true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					isPrime = false;
					break;				
				}
			}
			if(isPrime == true)
			{
				System.out.print(" "+i);
			}

		}		
		
	}
}


import java.util.Scanner;     //importing Scanner classs

public class EligibleForLoan1 {
public static void main(String args[] ){ 
          int sallary ;
 	      String country;
                           
	  	Scanner sc = new Scanner(System.in);

	  	System.out.print("Enter Your Country Name: ");
	  	country = sc.nextLine();      						// Use nextLine() to read the entire line of input.

	 	System.out.print("Enter Your Sallary: ");
	   	sallary = sc.nextInt();

	 	
	 
	  	if(sallary > 50000  && country.equals("INDIA")||country.equals("India")||country.equals("india"))
	    {
	           System.out.println("Congratulations !! You are eligible for a  Loan  ");    											
         }
	  	else
	     {
	         System.out.println(" Sorry!! your sallary "+ sallary + " is less than 50000  You are not eligible for loan");
	    }
	      sc.close();

     }
}
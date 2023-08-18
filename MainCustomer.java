//Create a class Customer where class varibles are (Custname,ProductName,ProductQuantity,TotalAmount )use appropriate getter setters for the same
import java.util.Scanner;
class Customer
{
	private String custoName;
	private String prodName;
	private int quantity;
	private int price;
	private int totalAmount;

	public String getProdName()
	{
		return prodName;
	}
	public void setProdName(String prodName)
	{
		this.prodName = prodName;
	}

	public String getCustoName()
	{
		return custoName;
	}
	public void setCustoName(String custoName)
	{
		this.custoName = custoName;
	}

	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity= quantity;
	}

	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price= price;
	}

	public int getTotalAmount()
	{
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount)
	{
		this.totalAmount = totalAmount;
	}
}

public class MainCustomer
{
	public static void main(String []arg)
	{
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);

		System.out.println("\nEnter your name :");			
		c.setCustoName(sc.next());
		System.out.println("Available products :");			
		System.out.println("1. name: A, price: Rs.100");			
		System.out.println("1. name: B, price: Rs.200");			
		System.out.println("1. name: C, price: Rs.300");			
		System.out.println("1. name: D, price: Rs.400");			
		System.out.println("1. name: E, price: Rs.500");

		System.out.println("\nEnter Product name :");			
		c.setProdName(sc.next());
		System.out.println("\nEnter quantity :");			
		c.setQuantity(sc.nextInt());
		
		switch(c.getProdName())
		{
			case "A": c.setTotalAmount(100*c.getQuantity());
			                c.setPrice(100);
				break;
			case "B": c.setTotalAmount(200*c.getQuantity());
			                c.setPrice(200);
				break;
			case "C": c.setTotalAmount(300*c.getQuantity());
			                c.setPrice(300);
				break;
			case "D": c.setTotalAmount(400*c.getQuantity());
			                c.setPrice(400);
				break;
			case "E": c.setTotalAmount(500*c.getQuantity());
			                c.setPrice(500);
				break;
			default: System.out.println("Invalid product name!");
		}
		
		if(c.getProdName().equals("A") || c.getProdName().equals("B") || c.getProdName().equals("C") || c.getProdName().equals("D") || 		c.getProdName().equals("E"))
		{
			System.out.println("\n Customer name : "+c.getCustoName());
			System.out.println(" Product name : "+c.getProdName());
			System.out.println("Product Price :"+c.getPrice());
			System.out.println("Product Quantity :"+c.getQuantity());
			System.out.println("Total Price : "+c.getTotalAmount());
		}
	}

}
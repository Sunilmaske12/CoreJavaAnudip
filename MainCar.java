class Car
{
	private String brand;
	private String modalName;
	private int topSpeed;

	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getModalName()
	{
		return modalName;
	}
	public void setModalName(String modalName)
	{
		this.modalName = modalName;
	}

	public int getTopSpeed()
	{
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed)
	{
		this.topSpeed = topSpeed;
	}
}

public class MainCar
{
	public static void main(String []arg)
	{
		Car car=new Car();
		car.setBrand("Hyundai");
		car.setModalName("Hyundai i20");
		car.setTopSpeed(45);
		
		Car car2=new Car();
		car2.setBrand("Tata");
		car2.setModalName("Tata Indica");
		car2.setTopSpeed(89);

		System.out.println("Brand name : "+car.getBrand());
		System.out.println("Modal name : "+car.getModalName());
		System.out.println("Top speed : "+car.getTopSpeed());

		System.out.println("\nBrand name : "+car2.getBrand());
		System.out.println("Modal name : "+car2.getModalName());
		System.out.println("Top speed : "+car2.getTopSpeed());
	}

}
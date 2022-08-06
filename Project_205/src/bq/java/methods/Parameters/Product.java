package bq.java.methods.Parameters;

public class Product 
{
	
	public void ProductName(String name)
	{
		System.out.println(name);
	}
	
	public void ProdcutPrice(double price)
	{
		System.out.println(price);
	}
	
	public void Productquantity(int num)
	{
		System.out.println(num);
	}
	
	public void ProductStatus(boolean availablestatus)
	{
		System.out.println(availablestatus);
	}
	
	//Sequence parameters
	public void productDetails(String name, String specfication)
	{
		System.out.println(name);
		System.out.println(specfication);
	}
	
	
	public void AllDetails(String name,int quantity,double price,boolean status)
	{
		
		System.out.println(name);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println(status);
		
	}
	
	
	public static void main(String[] args) 
	{
		Product obj=new Product();
		obj.ProductName("Iphone");
		obj.ProdcutPrice(75000.00);
		obj.Productquantity(2);
		obj.ProductStatus(true);
		obj.productDetails("Samsung", "256 GB");
		obj.AllDetails("Watch", 1, 10000.00, false);
	}

}

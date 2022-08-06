package bq.java.methods.Parameters;



public class GetDetails 
{
	
	//CallBYReference
	public void info(Product obj)
	{
		obj.ProductName("Samsung");
		obj.ProdcutPrice(25000.00);
		obj.ProductStatus(true);
	}
	

	public static void main(String[] args) 
	{
		GetDetails ref=new GetDetails();
		ref.info(new Product());
		
			
	}

}

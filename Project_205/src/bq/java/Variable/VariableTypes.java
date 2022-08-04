package bq.java.Variable;

public class VariableTypes 
{
	//Global variable [Instant Variable]
	int a=100;
	boolean flag=true;
	
	
	//Global Variable [Static variable]
	static int b=200;
	static double price=2300.00;
	
	
	public void method1()
	{
		String name="Aakash";           //Local Variable
		System.out.println(name);
	}
	
	

	public static void main(String[] args) 
	{
		//Creating object to class
		VariableTypes obj=new VariableTypes();
		int x=obj.a;			System.out.println(x);
		boolean y=obj.flag; 	System.out.println(y);
		
		
		int num=VariableTypes.b;
		System.out.println(num);
		
		double newprice=VariableTypes.price;
		System.out.println(newprice);
		
		
		int a=100;
		int b=200;
		System.out.println(a+b);

	}

}

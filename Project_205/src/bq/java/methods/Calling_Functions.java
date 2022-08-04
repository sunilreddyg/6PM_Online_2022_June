package bq.java.methods;

public class Calling_Functions 
{
	
	
	public void method1() 
	{
		System.out.println("method1 executed");
	}
	
	public void method2()
	{
		System.out.println("method2 executed");
	}
	
	public void method3()
	{
		method1();
		method2();
	}
	
	


	public static void main(String[] args) 
	{
		new Calling_Functions().method3();
	
	}

}

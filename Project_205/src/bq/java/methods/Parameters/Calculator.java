package bq.java.methods.Parameters;

public class Calculator 
{
	
	int a;
	int b;
	
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		new Calculator(10, 20).add();
		new Calculator(20, 3).mul();
	}

}

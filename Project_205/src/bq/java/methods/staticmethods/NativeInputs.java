package bq.java.methods.staticmethods;

public class NativeInputs 
{
	
	public static void Mouse() 
	{
		System.out.println("Mouse is active");
	}
	
	
	public static void Keybord() 
	{
		System.out.println("Keyboard is active");
	}
	
	public void touch()
	{
		System.out.println("Touch is active");
	}
	

	public static void main(String[] args) 
	{
		//With in a class any static methods call call without Class Instance[Constructor] and ClassName
		Mouse();
		Keybord();
		
		//Instant method only called through object creation only
		new NativeInputs().touch();

	}

}

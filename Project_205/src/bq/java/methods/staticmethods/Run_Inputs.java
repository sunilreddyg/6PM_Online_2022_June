package bq.java.methods.staticmethods;

public class Run_Inputs {

	public static void main(String[] args) 
	{
		
		
		//Calling static methods from different class
		NativeInputs.Keybord();
		NativeInputs.Mouse();
		
		//In-order to call instant method we should create object to class
		NativeInputs obj=new NativeInputs();
		obj.touch();
	
	}

}

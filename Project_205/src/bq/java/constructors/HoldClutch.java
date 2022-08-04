package bq.java.constructors;

public class HoldClutch 
{

	public HoldClutch() 
	{
		System.out.println("Hold Clutch");
	}
	
	
	public void First_Gear() 
	{
		System.out.println("Changed to First Gear");
	}
	
	public void Second_Gear()
	{
		System.out.println("Changed to Second Gear");
	}
	
	public void Third_Gear() 
	{
		System.out.println("Changed to third Gear");
		
	}

	
	public static void main(String[] args) 
	{
		new HoldClutch().First_Gear();
		new HoldClutch().Second_Gear();
		new HoldClutch().Third_Gear();
		
		
		//Using Class Reference call methods
		HoldClutch obj=new HoldClutch();
		obj.First_Gear();
		obj.Second_Gear();
		obj.Third_Gear();
			
	}

}

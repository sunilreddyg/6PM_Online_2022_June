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

	
	public static void main(String[] args) 
	{
		new HoldClutch().First_Gear();
		new HoldClutch().Second_Gear();
			
	}

}

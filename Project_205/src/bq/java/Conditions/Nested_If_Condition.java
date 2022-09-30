package bq.java.Conditions;

public class Nested_If_Condition {

	public static void main(String[] args) 
	{
		
		
		
		int Age=2;
		boolean GoodHealth=true;
		
		if(Age > 1)
		{
			//Nested if condition
			if(GoodHealth==true)
			{
				System.out.println("Accepted");
			}
			else
			{
				System.out.println("Accepted on COndition");
			}
		}
		else
		{
			System.out.println("Rejected");
		}

	}

}

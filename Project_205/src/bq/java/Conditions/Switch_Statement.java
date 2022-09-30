package bq.java.Conditions;

public class Switch_Statement {

	public static void main(String[] args) 
	{
	
		/*
		 * SwitchCase:-->
		 * 			1.It is also execute multiple decision statement
		 * 			2.Instead of checking all statements it execute
		 * 				only required statement.
		 * 		
		 */
		
		
		String month="apr";
		
		switch (month) 
		{
		
		case "jan":
			System.out.println("10% Discount");
			break;
			
		case "feb":
			System.out.println("20% Discount");
			break;

		case "mar":
			System.out.println("30% Discount");
			break;
			
		case "apr":
			System.out.println("40% Discount");
			break;
		default:System.out.println("No Discount");
			break;
		}
		
		
		

	}

}

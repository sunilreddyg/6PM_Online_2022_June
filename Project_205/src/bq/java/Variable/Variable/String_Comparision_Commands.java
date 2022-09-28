package bq.java.Variable;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class String_Comparision_Commands {

	public static void main(String[] args) 
	{
		/*
		 * String:-->
		 * 			=> String is a non-primitive datatype
		 * 			=> String starts with Uppercase characters
		 * 			=> String allow to store set of characters
		 * 			=> String data stored in double quotes
		 * 			=> Default value is null.
		 * 			=> string also called as class because it contains
		 * 				set of events.
		 */
		
		
		
		/*
		 * Equals:-->
		 * 			Method verify equal comparision between two strings and
		 * 			return boolean value true/false.
		 * 			=>Equal Comparision is case sensitive
		 */
		
		String exp_res="Account Created";
		String act_res="Account Created";
		
		boolean flag=exp_res.equals(act_res);
		System.out.println("Equal Comparision is ---> "+flag);
		
		
		
		/*
		 * EqualIgnorecase:-->
		 * 		Method verify Equal Comparision by ignoring casesensitive
		 */
		boolean flag1=exp_res.equalsIgnoreCase(act_res);
		System.out.println("EqualIgnorecase comparision is ---> "+flag1);
		
		
		
		/*
		 * Contains:-->
		 * 		Method verify subString characters available in main String
		 */
		String Status="Account 100 Created Successful";
		System.out.println(Status.contains("Account"));
		System.out.println(Status.contains("Account Created"));
		System.out.println(Status.contains("Created Successful"));
		
		
		
		/*
		 * length:-->
		 * 		Method return number of characters available with in String
		 */
		String Mobile="9030248855";
		int len=Mobile.length();
		System.out.println("Mobilenumber length is --> "+len);
		
		
		/*
		 * trim:-->
		 * 		Method trim extra space characters with in String
		 * 		[Left and right space characters]
		 */
		String Zipcode="   505050   ";
		System.out.println("Before Trim Zipcode length is --> "+Zipcode.length());
		String NewZipcode=Zipcode.trim();
		System.out.println("After trim zipcode length is ---> "+NewZipcode.length());
		
		
		
		/*
		 * SubString:-->
		 * 		Method get subString characters from mainString
		 */
		String AccountNumber="123488881111";
		String lastDidigts=AccountNumber.substring(8);
		System.out.println("Last four digit numbers are ---> "+lastDidigts);
		String MiddleDigits=AccountNumber.substring(4, 8);
		System.out.println("Account Middle digits are ---> "+MiddleDigits);
		
		
		
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at 7th index number ---> "+ch);
		

		
		/*
		 * ToLowerCase:-->
		 * 		method convert all Uppercase characters
		 * 		into lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		
		/*
		 * toUppercase:-->
		 * 		method convert all lowercase characters 
		 * 		into uppercase
		 */
		System.out.println(toolname.toUpperCase());
		

		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String browsers="Chrome,Firefox";
		String Rep=browsers.replace('o', 'i');
		System.out.println("After replace character is --> "+Rep);
		System.out.println(browsers.replaceAll("o", "i"));
		
		String Price="$2500";
		System.out.println(Price.replace("$", ""));
		System.out.println(Price.substring(1));
		

		
		

	}

}

package otherpackage;

import bq.java.Variable.VariableTypes;
import bq.java.methods.Calling_Functions;
import bq.java.methods.TVRemote;
import bq.java.methods.staticmethods.NativeInputs;

public class Running_Differnet_Package_Class_Methods_And_Variables 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Rule1:-->
		 * 		Any class,method,variable declared with public modifier only
		 * 		can call outside packages..
		 * 
		 * Rule2:--> 
		 * 		In Order to call any different package class methods and variables
		 * 		we should import package to current constructed class.
		 */
		
		TVRemote obj=new TVRemote();
		obj.turnon();
		obj.turonoff();
		
		Calling_Functions ref=new Calling_Functions();
		ref.method1();
		ref.method2();
		
		
		NativeInputs.Mouse();
		NativeInputs.Keybord();
		
		VariableTypes var=new VariableTypes();
		var.method1();
		System.out.println(var.a);

	}

}

package robot_WindowInterface_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Write_At_Notepad_file {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
		//Launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		//Type Hello Friends using keyboard interactions
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_S);
		

	}

}

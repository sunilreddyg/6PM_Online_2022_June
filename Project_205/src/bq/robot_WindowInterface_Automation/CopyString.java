package robot_WindowInterface_Automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString {

	public static void main(String[] args) throws Exception 
	{
		
		//Launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		
		String path="C:\\Users\\SUNIL\\OneDrive\\Desktop\\29th_Nov_11_30_AM-main (1)\\29th_Nov_11_30_AM-main\\Project_199\\src\\robot_window_interface";
		
		
		//CopyString to Clipboard
		StringSelection spath=new StringSelection(path);
		//Get System clipbaord 
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//now selected text set into clipboard memory
		clipboard.setContents(spath, spath);
		
		
		//Press Control+V shortcut 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Contrl Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		

	}

}

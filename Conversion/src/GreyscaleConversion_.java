
import javax.swing.SwingUtilities;

import controller.MainController;
import ij.plugin.PlugIn;
import view.MainGui;
 
//public class IPWorkFlow_ implements PlugIn {
//	public void run(String arg) {
//		IJ.showMessage("Olá Mundo!");
//	}
//}

public class GreyscaleConversion_ implements PlugIn {
	public void createAndShowGui() {		
		MainGui mainGui = new MainGui();
		new MainController(mainGui);
		mainGui.setVisible(false);
	}
	
	public void run(String arg) {		
		 SwingUtilities.invokeLater(new Runnable(){ 
	          public void run(){
	              createAndShowGui();
	          }
	      });
	}
}
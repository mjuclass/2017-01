package toolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import global.Constant;
import global.Constant.EShapes;

public class DrawingToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public DrawingToolBar() {
		
		ActionHandler ationHandler = new ActionHandler();
		
		for (int i=0; i<EShapes.values().length; i++) {
			JButton button = new JButton();
			button.setIcon(new ImageIcon(Constant.buttonIconName[i]));
			button.setPressedIcon(new ImageIcon(Constant.buttonIconSLTName[i]));
			// add event handler
			button.setActionCommand(EShapes.values()[i].toString());
			button.addActionListener(ationHandler);
			
			this.add(button);
		}
	}
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println(event.getActionCommand());			
		}		
	}

}

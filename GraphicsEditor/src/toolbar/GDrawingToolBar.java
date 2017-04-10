package toolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import global.GConstant.EShapes;
import panel.GDrawingPanel;

public class GDrawingToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	private GDrawingPanel drawingPanel;
	public void setDrawinPanel(GDrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel;
	}
	
	public GDrawingToolBar() {
		
		ActionHandler ationHandler = new ActionHandler();
		// for (i=0; i<EShapes.values.length(); i++) 
		//     shape = EShapes.values[i]
		for (EShapes eShape: EShapes.values()) {
			JButton button = new JButton();
			// set image icon
			button.setIcon(new ImageIcon(eShape.getIconName()));
			button.setPressedIcon(new ImageIcon(eShape.getIconSLTName()));
			// add event handler
			button.setActionCommand(eShape.toString());
			button.addActionListener(ationHandler);
			// register as a component
			this.add(button);
		}
	}
	// nested class
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			String actionCommnand = actionEvent.getActionCommand();
			drawingPanel.setCurrentTool(EShapes.valueOf(actionCommnand));
			System.out.println(actionCommnand);			
		}		
	}

}

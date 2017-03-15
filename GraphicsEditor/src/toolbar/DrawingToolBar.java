package toolbar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class DrawingToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public DrawingToolBar() {		
		JButton button;
		button = new JButton();
		button.setIcon(new ImageIcon("resource/rectangle.gif"));
		button.setPressedIcon(new ImageIcon("resource/rectangleSLT.gif"));
		this.add(button);
		button = new JButton();
		button.setIcon(new ImageIcon("resource/ellipse.gif"));
		button.setPressedIcon(new ImageIcon("resource/ellipseSLT.gif"));
		this.add(button);
		button = new JButton();
		button.setIcon(new ImageIcon("resource/line.gif"));
		button.setPressedIcon(new ImageIcon("resource/lineSLT.gif"));
		this.add(button);
		button = new JButton();
		button.setIcon(new ImageIcon("resource/polygon.gif"));
		button.setPressedIcon(new ImageIcon("resource/polygonSLT.gif"));
		this.add(button);
		button = new JButton();
		button.setIcon(new ImageIcon("resource/heart.gif"));
		button.setPressedIcon(new ImageIcon("resource/heartSLT.gif"));
		this.add(button);
		button = new JButton("TEXT");
		this.add(button);
	}

}

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ColorMenu extends JMenu {
	private static final long serialVersionUID = 1L;
	public ColorMenu() {
		super("Color");		
		JMenuItem lineColorItem = new JMenuItem("LineColor");
		this.add(lineColorItem);
		JMenuItem fillColorItem = new JMenuItem("FillColor");
		this.add(fillColorItem);
	}
}

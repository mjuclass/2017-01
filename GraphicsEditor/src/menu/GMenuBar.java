package menu;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class GMenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;
	
	public GMenuBar() {
		super();
		JMenu fileMenu = new GFileMenu();
		this.add(fileMenu);
		JMenu editMenu = new GEditMenu();
		this.add(editMenu);
		JMenu colorMenu = new GColorMenu();
		this.add(colorMenu);
	}
	public void initialize() {
		
	}

}

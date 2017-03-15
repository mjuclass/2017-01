package menu;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;
	
	public MenuBar() {
		super();
		JMenu fileMenu = new FileMenu();
		this.add(fileMenu);
		JMenu editMenu = new EditMenu();
		this.add(editMenu);
		JMenu colorMenu = new ColorMenu();
		this.add(colorMenu);
	}

}

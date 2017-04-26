package menu;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GFileMenu extends JMenu {
	private static final long serialVersionUID = 1L;
	public GFileMenu() {
		super("File");		
		JMenuItem newItem = new JMenuItem("New");
		this.add(newItem);
		JMenuItem openItem = new JMenuItem("Open");
		this.add(openItem);
		this.addSeparator();
		JMenuItem saveItem = new JMenuItem("Save");
		this.add(saveItem);
		JMenuItem saveAsItem = new JMenuItem("SaveAs");
		this.add(saveAsItem);
		this.addSeparator();
		JMenuItem closeItem = new JMenuItem("Close");
		this.add(closeItem);
		JMenuItem printItem = new JMenuItem("Print");
		this.add(printItem);
		this.addSeparator();
		JMenuItem exitItem = new JMenuItem("Exit");
		this.add(exitItem);
	}
}

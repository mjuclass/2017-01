import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FileMenu extends JMenu {
	private static final long serialVersionUID = 1L;
	public FileMenu() {
		super("File");		
		JMenuItem newItem = new JMenuItem("New");
		this.add(newItem);
		JMenuItem openItem = new JMenuItem("Open");
		this.add(openItem);
		JMenuItem saveItem = new JMenuItem("Save");
		this.add(saveItem);
		JMenuItem saveAsItem = new JMenuItem("SaveAs");
		this.add(saveAsItem);
		JMenuItem closeItem = new JMenuItem("Close");
		this.add(closeItem);
		JMenuItem printItem = new JMenuItem("Print");
		this.add(printItem);
		JMenuItem exitItem = new JMenuItem("Exit");
		this.add(exitItem);
	}
}

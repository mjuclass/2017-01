import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EditMenu extends JMenu {
	private static final long serialVersionUID = 1L;
	public EditMenu() {
		super("Edit");		
		JMenuItem cutItem = new JMenuItem("Cut");
		this.add(cutItem);
		JMenuItem pasteItem = new JMenuItem("Paste");
		this.add(pasteItem);
		JMenuItem deleteItem = new JMenuItem("Delete");
		this.add(deleteItem);
		JMenuItem doItem = new JMenuItem("Do");
		this.add(doItem);
		JMenuItem undoItem = new JMenuItem("Undo");
		this.add(undoItem);
		JMenuItem selectAllItem = new JMenuItem("SelectAll");
		this.add(selectAllItem);
		JMenuItem groupItem = new JMenuItem("Group");
		this.add(groupItem);
		JMenuItem ungorupItem = new JMenuItem("UpGroup");
		this.add(ungorupItem);
	}
}

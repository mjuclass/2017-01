import javax.swing.JFrame;
import javax.swing.JMenuBar;

/*********************************
public class JFrame {
	public JFrame(String title) {
		drawTitle(title);
	}
}
***********************************/


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	// components
	
	// constructor
	public MainFrame(String title) {
		// invoke super's constructor
		super(title);
		// initialize attributes
		this.setLocation(100,  50);
		this.setSize(400,  600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// initialize components
		JMenuBar menuBar = new MenuBar();
		this.setJMenuBar(menuBar);
	}
}

package main;
import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

import menu.GMenuBar;
import panel.GDrawingPanel;
import toolbar.GDrawingToolBar;

public class GMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private GMenuBar menuBar;
	private GDrawingToolBar drawingToolBar;
	private GDrawingPanel drawingPanel;
	
	public GMainFrame(String title) {
		// invoke super's constructor
		super(title);
		// initialize attributes
		this.setLocation(100,  50);
		this.setSize(400,  600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		
		// initialize components - Aggregation Hierarchy
		this.menuBar = new GMenuBar();
		this.setJMenuBar(menuBar);
		
		this.drawingToolBar = new GDrawingToolBar();
		this.add(drawingToolBar, BorderLayout.NORTH);
		
		this.drawingPanel = new GDrawingPanel();
		this.add(drawingPanel, BorderLayout.CENTER);
	
		// Association
		drawingToolBar.setDrawinPanel(drawingPanel);
	}
	public void initialize() {
		this.menuBar.initialize();
		this.drawingToolBar.initialize();
		this.drawingPanel.initialize();
	}
}

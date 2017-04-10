package main;
import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

import menu.GMenuBar;
import panel.GDrawingPanel;
import toolbar.GDrawingToolBar;

public class GMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	// components
	
	// constructor
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
		GMenuBar menuBar = new GMenuBar();
		this.setJMenuBar(menuBar);
		
		GDrawingToolBar drawingToolBar = new GDrawingToolBar();
		this.add(drawingToolBar, BorderLayout.NORTH);
		
		GDrawingPanel drawingPanel = new GDrawingPanel();
		this.add(drawingPanel, BorderLayout.CENTER);
		
		// Association
		drawingToolBar.setDrawinPanel(drawingPanel);
	}
}

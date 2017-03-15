package main;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import menu.MenuBar;
import panel.DrawingPanel;
import toolbar.DrawingToolBar;

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
		
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		
		// initialize components
		JMenuBar menuBar = new MenuBar();
		this.setJMenuBar(menuBar);
		
		JToolBar toolBar = new DrawingToolBar();
		this.add(toolBar, BorderLayout.NORTH);
		
		JPanel DrawingPanel = new DrawingPanel();
		this.add(DrawingPanel, BorderLayout.CENTER);		
	}
}

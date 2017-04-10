package panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import global.GConstant.EShapes;
import toolbar.GEllipse;
import toolbar.GRectangle;
import toolbar.GShape;

public class GDrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private EShapes eCurrentTool;
	public void setCurrentTool(EShapes eCurrentTool) {
		this.eCurrentTool = eCurrentTool;
	}	
	private GShape currentTool;
	
	public GDrawingPanel() {
		this.setBackground(Color.WHITE);
		MouseHandler mouseHandler = new MouseHandler();
		this.addMouseMotionListener(mouseHandler);
		this.addMouseListener(mouseHandler);
	}	
	public void paint(Graphics g) {
	}	
	private void draw() {
		Graphics2D g2d = (Graphics2D) this.getGraphics();
		g2d.setXORMode(getBackground());
		this.currentTool.draw(g2d);		
	}	
	private void initDrawing(int x, int y) {
		if (this.eCurrentTool == EShapes.eRectangle)
			this.currentTool = new GRectangle();
		else if (this.eCurrentTool == EShapes.eEllipse)
			this.currentTool = new GEllipse();
		
		this.currentTool.setLocation(x, y);
		this.currentTool.setSize(0, 0);
		this.draw();
	}
	private void keepDrawing(int x, int y) {
		this.draw();
		// 좌표 정리
		this.currentTool.setSize(x, y);
		// 그리기
		this.draw();
	}
	private void finalizeDrawing(int x, int y) {		
	}
	private class MouseHandler 
		implements MouseInputListener, MouseMotionListener {
		@Override
		public void mouseClicked(MouseEvent event) {
		}
		@Override
		public void mousePressed(MouseEvent event) {
			initDrawing(event.getX(), event.getY());
		}
		@Override
		public void mouseDragged(MouseEvent event) {
			keepDrawing(event.getX(), event.getY());
		}
		@Override
		public void mouseReleased(MouseEvent event) {
			finalizeDrawing(event.getX(), event.getY());
		}		
		@Override
		public void mouseMoved(MouseEvent event) {
		}		
		@Override
		public void mouseEntered(MouseEvent event) {
		}
		@Override
		public void mouseExited(MouseEvent event) {
		}
	}
}

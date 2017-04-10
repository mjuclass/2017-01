package panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import toolbar.GShape;

public class GDrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private GShape currentTool;
	public void setCurrentTool(GShape currentTool) {
		this.currentTool = currentTool;
	}	
	private GShape currentShape;
	private Vector<GShape> drawingShapes;
	
	public GDrawingPanel() {
		this.currentTool = null;
		this.currentShape = null;
		this.drawingShapes = new Vector<GShape>();
		
		this.setBackground(Color.WHITE);
		MouseHandler mouseHandler = new MouseHandler();
		this.addMouseMotionListener(mouseHandler);
		this.addMouseListener(mouseHandler);
	}	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		for (GShape shape: this.drawingShapes) {
			shape.draw(g2D);
		}
	}	
	private void draw() {
		Graphics2D g2d = (Graphics2D) this.getGraphics();
		g2d.setXORMode(getBackground());
		this.currentShape.draw(g2d);		
	}	
	private void initDrawing(int x, int y) {
		this.currentShape = this.currentTool.clone();
		this.currentShape.setLocation(x, y);
		this.currentShape.setSize(0, 0);
		this.draw();
	}
	private void keepDrawing(int x, int y) {
		this.draw();
		// 좌표 정리
		this.currentShape.setSize(x, y);
		// 그리기
		this.draw();
	}
	private void finalizeDrawing(int x, int y) {
		this.drawingShapes.add(this.currentShape);
		
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

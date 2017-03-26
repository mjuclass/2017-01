package panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import global.Constant.EShapes;

public class DrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	EShapes currentTool;
	public void setCurrentTool(EShapes currentTool) {
		this.currentTool = currentTool;
	}
	
	public DrawingPanel() {
		this.setBackground(Color.WHITE);
		MouseHandler mouseHandler = new MouseHandler();
		this.addMouseMotionListener(mouseHandler);
		this.addMouseListener(mouseHandler);
	}
	
	public void paint(Graphics g) {
	}
	
	private void draw(int x, int y, int w, int h) {
		Graphics2D g2D = (Graphics2D) this.getGraphics();
		g2D.setXORMode(getBackground());
		
		if (this.currentTool == EShapes.eRectangle) {
			g2D.drawRect(x, y, w, h);
		} else if (this.currentTool == 1) {
			g2D.drawOval(x, y, w, h);			
		} else if (this.currentTool == 2) {
			g2D.drawLine(x, y, x+w, y+h);			
		}	
	}
	
	
	private class MouseHandler 
		implements MouseInputListener, MouseMotionListener {
		int x0, y0, x1, y1;
		
		@Override
		public void mouseClicked(MouseEvent event) {
		}
		
		@Override
		public void mousePressed(MouseEvent event) {
			x0 = event.getX();
			y0 = event.getY();
			x1 = x0;
			y1 = y0;
			draw(x0, y0, x1-x0, y1-y0);
		}
		@Override
		public void mouseDragged(MouseEvent event) {
			draw(x0, y0, x1-x0, y1-y0);
			x1 = event.getX();
			y1 = event.getY();
			draw(x0, y0, x1-x0, y1-y0);
		}
		@Override
		public void mouseReleased(MouseEvent event) {
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

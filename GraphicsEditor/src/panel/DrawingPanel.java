package panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class DrawingPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public DrawingPanel() {
		this.setBackground(Color.WHITE);
		MouseHandler mouseHandler = new MouseHandler();
		this.addMouseMotionListener(mouseHandler);
		this.addMouseListener(mouseHandler);
	}
	
	public void paint(Graphics g) {
		g.drawRect(20,30,20,20);
	}
	
	private void draw(int x, int y, int w, int h) {
		Graphics2D g2D = (Graphics2D) this.getGraphics();
		g2D.setXORMode(getBackground());
		g2D.drawRect(x, y, w, h);
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
			x1 = event.getX();
			y1 = event.getY();
			draw(x0, y0, x1-x0, y1-y0);
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

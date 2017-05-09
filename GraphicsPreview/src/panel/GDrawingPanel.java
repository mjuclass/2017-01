package panel;

import java.awt.Color;
import java.awt.Cursor;
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
	enum EDrawingState { eIdle, eDrawing, eMoving, eResizing, eRotating };

	private GShape currentTool;
	public void setCurrentTool(GShape currentTool) {
		this.currentTool = currentTool;
	}
	
	private GShape currentShape;
	private Vector<GShape> drawingShapes;
	EDrawingState eDrawingState;
	
	public GDrawingPanel() {
		this.currentTool = null;
		this.currentShape = null;
		this.drawingShapes = new Vector<GShape>();
		this.eDrawingState = EDrawingState.eIdle;
		
		this.setBackground(Color.WHITE);
		MouseHandler mouseHandler = new MouseHandler();
		this.addMouseMotionListener(mouseHandler);
		this.addMouseListener(mouseHandler);
	}	
	public void initialize() {		
	}
	
	public void paint(Graphics g) {
		super.paint(g);		
		Graphics2D g2d = (Graphics2D) g;
		for (GShape shape: this.drawingShapes) {
			g2d.setXORMode(g2d.getBackground());
			shape.draw(g2d);
			g2d.setPaintMode();
			shape.drawAnchors(g2d);
		}
	}	
	private void initDrawing(int x, int y) {
		this.clearAnchors();		
		
		this.currentShape = this.currentTool.clone();
		this.currentShape.setLocation(x, y);
		this.currentShape.setSize(0, 0);

		Graphics2D g2d = (Graphics2D) this.getGraphics();
		this.currentShape.draw(g2d);
	}
	private void keepDrawing(int x, int y) {
		Graphics2D g2d = (Graphics2D) this.getGraphics();
		g2d.setXORMode(g2d.getBackground());
		this.currentShape.draw(g2d);
		this.currentShape.setSize(x, y);
		this.currentShape.draw(g2d);
	}
	private void finalizeDrawing(int x, int y) {
		this.drawingShapes.add(this.currentShape);			
		this.drawAnchors();
	}
	private void initMoving(int x, int y) {
		this.clearAnchors();		
		this.currentShape.initMoving(x, y);
	}
	private void keepMoving(int x, int y) {
		Graphics2D g2d = (Graphics2D) this.getGraphics();
		g2d.setXORMode(g2d.getBackground());
		this.currentShape.draw(g2d);
		this.currentShape.keepMoving(x, y);
		this.currentShape.draw(g2d);
	}
	private void finalizeMoving(int x, int y) {
		this.drawAnchors();
	}
	
	private void clearAnchors() {
		// erase anchors
		for (GShape shape: this.drawingShapes) {
			shape.setSelected(false);
		}
		repaint();
	}
	private void drawAnchors() {
		if (this.currentShape != null) {
			this.currentShape.setSelected(true);
			repaint();
		}
	}
	
	private GShape onShape(int x, int y) {
		for (GShape shape: this.drawingShapes) {
			if (shape.isOn(x, y)) {
				return shape;
			}
		}
		return null;
	}
	private void changeCursor(int x, int y) {
		currentShape = onShape(x, y);
		if (currentShape == null) {
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));				
		} else {
			if (this.currentShape.getselectedAchor() == null) {
				setCursor(new Cursor(Cursor.MOVE_CURSOR));
			} else {
				switch(this.currentShape.getselectedAchor()) {
					case NN: setCursor(new Cursor(Cursor.N_RESIZE_CURSOR));		break;
					case NW: setCursor(new Cursor(Cursor.NW_RESIZE_CURSOR));	break;
					case NE: setCursor(new Cursor(Cursor.NE_RESIZE_CURSOR));	break;
					case SS: setCursor(new Cursor(Cursor.S_RESIZE_CURSOR));		break;
					case SW: setCursor(new Cursor(Cursor.SW_RESIZE_CURSOR));	break;
					case SE: setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));	break;
					case EE: setCursor(new Cursor(Cursor.E_RESIZE_CURSOR));		break;
					case WW: setCursor(new Cursor(Cursor.W_RESIZE_CURSOR));		break;
					case RR: setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));	break;
					default: break;
				}
			}
		}
	}
	private class MouseHandler 
		implements MouseInputListener, MouseMotionListener {
		@Override
		public void mouseClicked(MouseEvent event) {
		}
		@Override
		public void mousePressed(MouseEvent event) {
			currentShape = onShape(event.getX(), event.getY());
			if (currentShape == null) {
				initDrawing(event.getX(), event.getY());
				eDrawingState = EDrawingState.eDrawing;
			} else {
				initMoving(event.getX(), event.getY());
				eDrawingState = EDrawingState.eMoving;
			}
		}
		@Override
		public void mouseDragged(MouseEvent event) {
			if (eDrawingState==EDrawingState.eDrawing) {
				keepDrawing(event.getX(), event.getY());
			} else if (eDrawingState==EDrawingState.eMoving) {
				keepMoving(event.getX(), event.getY());				
			}
		}
		@Override
		public void mouseReleased(MouseEvent event) {
			if (eDrawingState==EDrawingState.eDrawing) {
				finalizeDrawing(event.getX(), event.getY());
				eDrawingState = EDrawingState.eIdle;
			} else if (eDrawingState==EDrawingState.eMoving) {
				finalizeMoving(event.getX(), event.getY());
				eDrawingState = EDrawingState.eIdle;
			}
		}		
		@Override
		public void mouseMoved(MouseEvent event) {
			changeCursor(event.getX(), event.getY());
		}		
		@Override
		public void mouseEntered(MouseEvent event) {
		}
		@Override
		public void mouseExited(MouseEvent event) {
		}
	}
}

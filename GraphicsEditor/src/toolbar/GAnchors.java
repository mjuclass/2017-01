package toolbar;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.Vector;

public class GAnchors {
	public enum EAnchors {NN, NW, NE, SS, SW, SE, EE, WW, RR}
	public final int WIDTH = 10;
	public final int HEIGHT = 10;
	
	private Vector<Ellipse2D> anchors;
	public GAnchors() {
		this.anchors = new Vector<Ellipse2D>();
		for (EAnchors eAnchor: EAnchors.values()) {
			Ellipse2D anchor = new Ellipse2D.Double();
			anchor.setFrame(0, 0, WIDTH, HEIGHT);
			this.anchors.add(anchor);
		}		
	}
	public void draw(Graphics2D g2D, Rectangle r) {
		// ÁÂÇ¥ °è»ê
		Color lineColor = g2D.getColor();
		Color fillColor = g2D.getBackground();
		for (EAnchors eAnchor: EAnchors.values()) {
			int x = 0;
			int y = 0;
			switch(eAnchor) {
			case NN:x = r.x + r.width/2; 	y = r.y; 				break;
			case NW:x = r.x; 				y = r.y; 				break;
			case NE:x = r.x + r.width; 		y = r.y;				break;
			case SS:x = r.x + r.width/2;	y = r.y + r.height;		break;
			case SW:x = r.x;				y = r.y + r.height;		break;
			case SE:x = r.x + r.width;		y = r.y + r.height;		break;
			case EE:x = r.x + r.width;		y = r.y + r.height/2;	break;
			case WW:x = r.x;				y = r.y + r.height/2;	break;
			case RR:x = r.x + r.width/2;	y = r.y - 30;			break;
			default: break;
			}
			x = x - WIDTH/2;
			y = y - HEIGHT/2;
			this.anchors.get(eAnchor.ordinal()).setFrame(x, y, WIDTH, HEIGHT);
			
		}
		for (Ellipse2D anchor: this.anchors) {
			g2D.setColor(Color.WHITE);
			g2D.fill(anchor);
			g2D.setColor(lineColor);
			g2D.draw(anchor);
		}
	}
}

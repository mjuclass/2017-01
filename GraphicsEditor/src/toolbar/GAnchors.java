package toolbar;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.Vector;

public class GAnchors {
	enum EAnchors {NN, NW, NE, SS, SW, SE, EE, WW, RR} 
	private Vector<Ellipse2D> anchors;
	public GAnchors() {
		this.anchors = new Vector<Ellipse2D>();
		for (int i=0; i<EAnchors.values().length; i++) {
			Ellipse2D anchor = new Ellipse2D.Double();
			anchor.setFrame(0, 0, 4, 4);
			this.anchors.add(anchor);
		}		
	}
	public void draw(Graphics2D g2D, Rectangle r) {
		// ÁÂÇ¥ °è»ê
		g2D.setXORMode(g2D.getBackground());
		for (int i=0; i<EAnchors.values().length; i++) {
			g2D.draw(this.anchors.get(i));
		}
	}
}

package toolbar;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class GRectangle extends GShape {
	private Rectangle shape;
	
	public GRectangle() {
		this.shape = new Rectangle(0, 0, 0, 0);
	}
	public void setLocation(int x, int y) {	
		this.shape.setFrame(x, y, 
				this.shape.getWidth(), this.shape.getHeight()); 
	}
	public void setSize(int x, int y) {	
		this.shape.setFrame(this.shape.getX(), this.shape.getY(), 
				x-this.shape.getX(), y-this.shape.getY()); 
	}
	public void draw(Graphics2D g2D) {
		g2D.setXORMode(g2D.getBackground());
		g2D.draw(this.shape);	
	}
}
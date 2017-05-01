package toolbar;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class GRectangle extends GShape {
	private Rectangle shape;
	
	public GRectangle() {
		this.shape = new Rectangle(0, 0, 0, 0);
	}
	public void setLocation(int x, int y) {
		this.shape.setLocation(x, y);
	}
	public void setSize(int x, int y) {	
		this.shape.setSize(x-this.shape.x, y-this.shape.y); 
	}
	public void draw(Graphics2D g2D) {
		g2D.setXORMode(g2D.getBackground());
		g2D.draw(this.shape);
		if (this.selected)
			this.anchors.draw(g2D, this.shape.getBounds());
	}
	@Override
	public boolean isOn(int x, int y) {
		return this.shape.contains(x, y);
	}
	@Override
	public void initMoving(int x, int y) {
		px = x;
		py = y;
	}
	@Override
	public void keepMoving(int x, int y) {
		this.shape.x = this.shape.x + x - px;
		this.shape.y = this.shape.y + y - py;
		px = x;
		py = y;
	}
}










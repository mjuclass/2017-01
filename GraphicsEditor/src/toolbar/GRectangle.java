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
		if (this.selected)
			this.anchors.draw(g2D, x, y, w, h);
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










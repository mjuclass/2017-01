package toolbar;

import java.awt.Graphics2D;

// interface class
public abstract class GShape {
	public GShape() {}
	public abstract void setLocation(int x, int y);
	public abstract void setSize(int x, int y);	
	public abstract void draw(Graphics2D g2D);
}

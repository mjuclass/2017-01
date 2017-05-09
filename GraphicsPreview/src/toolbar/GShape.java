package toolbar;

import java.awt.Graphics2D;

import toolbar.GAnchors.EAnchors;

// interface class
public abstract class GShape {
	protected int px, py;
	protected GAnchors anchors;
	protected boolean selected;
	EAnchors selectedAnchor;
	
	public EAnchors getselectedAchor() { return this.selectedAnchor; }
	
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public GShape() {
		this.anchors = new GAnchors();
		this.selected = false;
		this.selectedAnchor = null;
	}
	public abstract void setLocation(int x, int y);
	public abstract void setSize(int x, int y);	
	public abstract void draw(Graphics2D g2D);
	public abstract void drawAnchors(Graphics2D g2D);
	public GShape clone() {
		try {
			return this.getClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	public abstract boolean isOn(int x, int y);
	public abstract void initMoving(int x, int y);
	public abstract void keepMoving(int x, int y);
}

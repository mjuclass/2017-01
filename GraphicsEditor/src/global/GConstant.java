package global;

import toolbar.GRectangle;
import toolbar.GShape;

public class GConstant {
	// configurations
	public static String PATH = "resource";
	public static enum EShapes {
		eRectangle("rectangle.gif","rectangleSLT.gif", new GRectangle()),
		eEllipse("ellipse.gif","ellipseSLT.gif", new GRectangle()),
		eLine("line.gif","lineSLT.gif", new GRectangle()),
		ePolygon("polygon.gif","polygonSLT.gif", new GRectangle()),
		ePolygon1("polygon.gif","polygonSLT.gif", new GRectangle()),
		eHeart("heart.gif","heartSLT.gif", new GRectangle());
		
		private String iconName;
		private String iconSLTName;
		private GShape shape;
		private EShapes(String iconName, String iconSLTName, GShape shape) {
			this.iconName = iconName;
			this.iconSLTName = iconSLTName;
			this.shape = shape;
		}
		public String getIconName() { 
			return PATH + '/' + this.iconName; 
		}
		public String getIconSLTName() {
			return PATH + '/' + this.iconSLTName; 
		}
		public GShape getShape() {
			return this.shape;
		}
	};	
}

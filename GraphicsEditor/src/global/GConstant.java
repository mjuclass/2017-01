package global;

public class GConstant {
	// configurations
	public static String PATH = "resource";
	public static enum EShapes {
		eRectangle("rectangle.gif","rectangleSLT.gif"),
		eEllipse("ellipse.gif","ellipseSLT.gif"),
		eLine("line.gif","lineSLT.gif"),
		ePolygon("polygon.gif","polygonSLT.gif"),
		ePolygon1("polygon.gif","polygonSLT.gif"),
		eHeart("heart.gif","heartSLT.gif");
		
		private String iconName;
		private String iconSLTName;
		private EShapes(String iconName, String iconSLTName) {
			this.iconName = iconName;
			this.iconSLTName = iconSLTName;
		}
		public String getIconName() { 
			return PATH + '/' + this.iconName; 
		}
		public String getIconSLTName() {
			return PATH + '/' + this.iconSLTName; 
		}	
	};	
}

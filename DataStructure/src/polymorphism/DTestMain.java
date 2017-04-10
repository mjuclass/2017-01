package polymorphism;

public class DTestMain {
	public void execute() {
		// overriding - polymorphism
		DShape shape = new DShape();
		shape.draw();	
		shape = new DRectangle();
		shape.draw();
		shape = new DEllipse();
		shape.draw();
		
		// overloading - inheritance
		DRectangle rectangle;
		rectangle = new DRectangle();
		rectangle.draw();
		
		// Type Casting
		Object object = new DRectangle();
		rectangle = (DRectangle)object;
	}
}

package polymorphism;

public class DTestMain {
	public void execute() {
		// overriding - polymorphism
		DShape shape;
		shape = new DRectangle();
		shape.draw();
		shape = new DEllipse();
		shape.draw();
		
		// overloading - inheritance
		DRectangle rectangle = new DRectangle();
		rectangle.draw();
		
		// Super Class "Object"
		Object object = new DTestMain();
		System.out.println(object.getClass().getName());

	}
}

package polymorphism;

public class DRectangle extends DShape {

	@Override
	public void draw() {
		System.out.println(this.getClass().getName());
	}
}

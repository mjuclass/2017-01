package objectVector;

public class DTestMain {
	public void execute() {
		try {
			DVector vector = new DVector();
			for (int i=0; i<10; i++) {
				DShape shape = new DShape();
				shape.setX(i);
				shape.setY(i*10);
				vector.add(shape);
			}
			for (int i=0; i<10; i++) {
				DShape shape = (DShape)vector.get(i);
				System.out.println(shape.getX()+" "+shape.getY());
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package generic;

public class CTest {
	public void execute() {
		
		CArray<CElement> array = new CArray<CElement>();
		
		for (int i=0; i<5; i++) {
			array.add(new CElement(i));
		}
		for (int i=0; i<5; i++) {
			System.out.println(array.get(i).getId());
		}
	}
}

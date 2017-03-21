package polymorphism;

import generic.CElement;

public class CTest {
	public void execute() {
		
		CArray array = new CArray();
		
		for (int i=0; i<5; i++) {
			array.add(new CElement(i));
		}
		for (int i=0; i<5; i++) {
			CElement element = (CElement)array.get(i);
			System.out.println(element.getId());
		}
	}
}

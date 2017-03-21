package polymorphism;

public class CArray {
	private Object[] array;
	private int length;
	
	public CArray() {
		this.length = 0;
		this.array = new Object[10];	}

	public Object get(int i) {
		return array[i];
	}
	public void add(Object element) {
		this.array[this.length] = element;
		this.length++;
	}
	
}

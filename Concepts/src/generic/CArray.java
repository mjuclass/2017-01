package generic;

public class CArray<T> {
	private T[] array;
	private int length;
	
	@SuppressWarnings("unchecked")
	public CArray() {
		this.length = 0;
		this.array = (T[]) new Object[10];	
	}

	public T get(int i) {
		return array[i];
	}
	public void add(T element) {
		this.array[this.length] = element;
		this.length++;
	}
	
}

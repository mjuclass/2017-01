package vector;

public class DVector {
	// internal structure
	private int aData[];
	private int size;
	// constructor
	public DVector() {
		this.aData = new int[10];
		this.size = 0;
	}
	public void add(int data) throws Exception {
		if (this.size >= aData.length) {
			throw new Exception("DVector::add-ArrayIndexOutOfBounds");
		}
		
		this.aData[this.size] = data;
		this.size++;
	}
	public int get(int index) throws Exception {
		if (this.size <= index) {
			throw new Exception("DVector::get-ArrayIndexOutOfBounds");
		}		
		return this.aData[index];
	}
	public int getSize() {
		return this.size;
	}
	public void remove() throws Exception {
		if (this.size <= 0) {
			throw new Exception("DVector::remove-ArrayIndexOutOfBounds");
		}
		this.size--;		
	}
	public void insert(int index, int data) {
		
	}
	public void remove(int index) {
		
	}
}

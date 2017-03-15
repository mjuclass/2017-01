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
	public int getSize() {
		return this.size;
	}
	public int get(int index) throws Exception {
		if ((index >= this.size) || (index < 0)) {
			throw new Exception("DVector::get-ArrayIndexOutOfBounds");
		}		
		return this.aData[index];
	}
	public void add(int data) throws Exception {		
		if (this.size >= aData.length) {
			// overflow
			throw new Exception("DVector::add-ArrayIndexOutOfBounds");
		}
		this.aData[this.size] = data;
		this.size++;
	}
	public void add(int index, int data) throws Exception {
		if (((index > this.size) || (index < 0)) 
				|| (this.size>(this.aData.length-1))) {
			throw new Exception("DVector::insert-ArrayIndexOutOfBounds");
		}
		// move elements
		for (int i=this.size-1; i>=index; i--) {
			this.aData[i+1] = this.aData[i];
		}
		this.aData[index] = data;
		this.size++;
	}
	public int remove() throws Exception {
		if (this.size <= 0) {
			// underflow
			throw new Exception("DVector::remove-ArrayIndexOutOfBounds");
		}
		int returnValue = this.aData[this.size];
		this.size--;		
		return returnValue;	
	}
	public int remove(int index) throws Exception {
		if ((index >= this.size) || (index < 0)) {
			throw new Exception("DVector::remove-ArrayIndexOutOfBounds");
		}
		int returnValue = this.aData[index];
		for (int i=index+1; i<this.size; i++) {
			this.aData[i-1] = this.aData[i];			
		}
		this.size--;		
		return returnValue;	
	}
}

package vector;

public class DVector {
	// internal structure
	private int size;
	private int aData[];
	
	// constructor
	public DVector() {
		this.aData = new int[DConstant.VECTOR_SIZE];
		this.size = 0;
	}
	
	// getters & setters
	public int getSize() {
		return size;
	}
	
	// Create, Read, Update, Delete (CRUD)
	public int get(int index) throws Exception {
		// precondition
		if ((index >= this.size) || (index < 0)) {			
			throw new Exception(
					this.getClass().getSimpleName()
					+ ":"+DConstant.EMSG_ARRAYINDEXOUTOFBOUNDS);
		}
		
		return this.aData[index];
	}
	public void add(int data) throws Exception {		
		if (this.size >= aData.length) {
			throw new Exception(
					this.getClass().getSimpleName()
					+ ":"+DConstant.EMSG_ARRAYINDEXOUTOFBOUNDS);
		}
		
		this.aData[this.size] = data;
		this.size++;
	}
	public void add(int index, int data) throws Exception {
		if (((index > this.size) || (index < 0)) 
				|| (this.size>(this.aData.length-1))) {
			throw new Exception(
					this.getClass().getSimpleName()
					+ ":"+DConstant.EMSG_ARRAYINDEXOUTOFBOUNDS);
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
			throw new Exception(
					this.getClass().getSimpleName()
					+ ":"+DConstant.EMSG_ARRAYINDEXOUTOFBOUNDS);
		}
		int returnValue = this.aData[this.size];
		this.size--;		
		return returnValue;	
	}
	public int remove(int index) throws Exception {
		if ((index >= this.size) || (index < 0)) {
			throw new Exception(
					this.getClass().getSimpleName()
					+ ":"+DConstant.EMSG_ARRAYINDEXOUTOFBOUNDS);
		}
		int returnValue = this.aData[index];
		for (int i=index+1; i<this.size; i++) {
			this.aData[i-1] = this.aData[i];			
		}
		this.size--;		
		return returnValue;	
	}
}

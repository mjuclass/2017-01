package genericVector;

public class DVector<TYPE> {
	// internal structure
	private int size;
	private TYPE aData[];
	
	// constructor
	@SuppressWarnings("unchecked")
	public DVector() {
		this.aData = (TYPE[]) new Object[DConstant.VECTOR_SIZE];
		this.size = 0;
	}
	
	// getters & setters
	public int getSize() {
		return size;
	}
	
	// Create, Read, Update, Delete (CRUD)
	public TYPE get(int index) throws Exception {
		// precondition
		if ((index >= this.size) || (index < 0)) {			
			throw new Exception(
					this.getClass().getSimpleName()
					+ ":"+DConstant.EMSG_ARRAYINDEXOUTOFBOUNDS);
		}
		
		return this.aData[index];
	}
	public void add(TYPE data) throws Exception {		
		if (this.size >= aData.length) {
			throw new Exception(
					this.getClass().getSimpleName()
					+ ":"+DConstant.EMSG_ARRAYINDEXOUTOFBOUNDS);
		}
		
		this.aData[this.size] = data;
		this.size++;
	}
	public void add(int index, TYPE data) throws Exception {
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
	public TYPE remove() throws Exception {
		if (this.size <= 0) {
			throw new Exception(
					this.getClass().getSimpleName()
					+ ":"+DConstant.EMSG_ARRAYINDEXOUTOFBOUNDS);
		}
		TYPE returnValue = this.aData[this.size];
		this.size--;		
		return returnValue;	
	}
	public TYPE remove(int index) throws Exception {
		if ((index >= this.size) || (index < 0)) {
			throw new Exception(
					this.getClass().getSimpleName()
					+ ":"+DConstant.EMSG_ARRAYINDEXOUTOFBOUNDS);
		}
		TYPE returnValue = this.aData[index];
		for (int i=index+1; i<this.size; i++) {
			this.aData[i-1] = this.aData[i];			
		}
		this.size--;		
		return returnValue;	
	}
}

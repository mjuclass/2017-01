package stack;

public class DStack<ELEMENT_TYPE> {
	public final static int MAXSIZE = 2;
	
	private int top;
	private ELEMENT_TYPE elements[];
	@SuppressWarnings("unchecked")
	public DStack() {
		this.top = 0;
		this.elements = (ELEMENT_TYPE[]) new Object[MAXSIZE];
	}
	public void push(ELEMENT_TYPE element) throws Exception {
		if (this.top < MAXSIZE) {
			this.elements[this.top] = element;
			this.top++;
		} else {
			throw new Exception("Stack Overflow: "+this.top);
		}
	}
	public ELEMENT_TYPE pop() throws Exception {
		if (this.top>0) {
			this.top--;
			ELEMENT_TYPE element = this.elements[this.top];
			return element;
		} else {
			throw new Exception("Stack Empty");			
		}
	}

}

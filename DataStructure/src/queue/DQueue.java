package queue;

import queue.DConstant;

public class DQueue {
	private int front, back;
	private int aData[];

	// constructors
	public DQueue() {
		this.aData = new int[DConstant.QUEUE_SIZE];
		this.front = 0;		
		this.back = 0;		
	}
	// private functions
	private boolean isEmpty() {
		if (this.front == this.back) 
			return true;
		return false;
	}
	private boolean isFull() {
		if (this.back == DConstant.QUEUE_SIZE)
			return true;
		return false;
	}
	// public functions
	public int getSize() {
		return (this.back - this.front);
	}
	public void enqueue(int value) throws Exception {
		// check precondition: input parameters, action의 대상 상태 확인
		if (this.isFull())
			throw new Exception("quque full");
		// action
		this.aData[this.back] = value;
		this.back++;
		// process postcondition
	}
	public int dequeue() throws Exception {
		// check precondition
		if (this.isEmpty())
			throw new Exception("quque empty");
		// action
		int value;
		value = this.aData[this.front];
		this.front++;
		return value;
	}
}

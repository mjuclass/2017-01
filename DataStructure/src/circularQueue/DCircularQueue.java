package circularQueue;

import circularQueue.DConstant;

public class DCircularQueue {
	private int front, back, size;
	private int aData[];

	// constructors
	public DCircularQueue() {
		this.aData = new int[DConstant.QUEUE_SIZE];
		this.front = 0;		
		this.back = 0;
		this.size = 0;
	}
	// private functions
	private boolean isEmpty() {
		if (this.size == 0) 
			return true;
		return false;
	}
	private boolean isFull() {
		if (this.size == DConstant.QUEUE_SIZE)
			return true;
		return false;
	}
	// public functions
	public int getSize() {
		return this.size;
	}
	public void enqueue(int value) throws Exception {
		// check precondition: input parameters, action의 대상 상태 확인
		if (this.isFull())
			throw new Exception("quque full");
		// action
		this.aData[this.back] = value;
		this.size++;
		if (this.back == DConstant.QUEUE_SIZE)
			this.back = 0;
		else
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
		
		this.size--;		
		if (this.front == DConstant.QUEUE_SIZE)
			this.front = 0;
		else
			this.front++;
		
		return value;
	}
}

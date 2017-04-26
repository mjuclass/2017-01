package stack;

public class DTestMain {
	public void execute() {		
		try {
			DStack<Integer> stack = new DStack<Integer>();
			stack.push(3);
			stack.push(4);
			
			int element = stack.pop();
			System.out.println(element);
			element = stack.pop();
			System.out.println(element);
			element = stack.pop();
			System.out.println(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

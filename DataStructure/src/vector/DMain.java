package vector;

public class DMain {
	public static void main(String[] args) {		
		try {
			DVector dVector = new DVector();

			for (int i = 0; i < 10; i++) {
				dVector.add(i, i * 10);
			}
			
			
			
//			int size = dVector.getSize();
//			for (int i = 0; i < size; i++) {
//				dVector.remove();		
//			}
			
			// data validation
			System.out.println("size: "+dVector.getSize());
			for (int i = 0; i < dVector.getSize(); i++) {
				System.out.println("index-"+i+": "+dVector.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

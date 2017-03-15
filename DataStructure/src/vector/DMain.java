package vector;

public class DMain {
	public static void main(String[] args) {		
		try {
			DVector dVector = new DVector();

			for (int i = 0; i < 5; i++) {
				dVector.add(i * 10);
			}
			for (int i = 0; i < dVector.getSize(); i++) {
				System.out.println(dVector.get(i));
			}
			for (int i = 0; i < (dVector.getSize()+1); i++) {
				dVector.remove();		
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

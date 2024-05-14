package main;

public class Quiz3 {

	public static void main(String[] args) {
		
		try {
			Object obj = new Integer(0);
			String str = (String) obj; // 형변환을 잘못해서 에러남
			
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		
	}

}

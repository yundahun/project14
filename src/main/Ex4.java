package main;

public class Ex4 {

	public static void main(String[] args) {
		
		
		try {

			int[] arr = new int[5];
			arr[5] = 5;
			
		} catch (ClassCastException e) {
			System.out.println(e);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}

package main;

public class Ex5 {

	public static void main(String[] args) {
		
		try {

			int[] arr = new int[5];
			arr[5] = 5;
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			
		// Exception형 매개변수를 사용하면, 모든 에러를 처리할 수 있음	
		} catch (Exception e) {
			
			System.out.println(e); // 에러메세지만 출력

			e.printStackTrace(); // 에러가 발생한 위치와 에러메세지를 함께 출력
		}
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}

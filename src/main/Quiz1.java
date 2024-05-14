package main;

public class Quiz1 {

	// 프로그램이 정상적으로 종료되도록 예외를 처리하세요
	public static void main(String[] args) {
		
		
		try {
			int num = 5/0; // 0으로 나눌 수 없어서 에러남
	
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}

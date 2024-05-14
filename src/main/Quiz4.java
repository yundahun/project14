package main;

public class Quiz4 {

	public static void main(String[] args) {

		try {
			String str = "1.23";
			int num = Integer.parseInt(str); // 실수를 정수로 변환하려고해서 에러남

		} catch (NumberFormatException e) {
			System.out.println(e);
		}

	}

}

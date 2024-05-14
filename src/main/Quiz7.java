package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Quiz7 {

	public static void main(String[] args) {


		try {
			Set<Integer> set = new HashSet<>();
			
			set.add(1);
			set.add(2);
			set.add(3);
			
			Iterator<Integer> iterator = set.iterator();
			
			int num1 = iterator.next();
			int num2 = iterator.next();
			int num3 = iterator.next();
			int num4 = iterator.next(); // 더 이상 꺼낼 요소가 없어서 에러남
			
		} catch (NoSuchElementException e) {
			
			System.out.println(e);
		}
		
		
	}

}

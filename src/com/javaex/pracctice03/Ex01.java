package com.javaex.pracctice03;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("while문");
		int index = 0;
		while(index < 3) {
			System.out.println("index=" + index);
			index++;
		}
		
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order" + order);
		}
		//출력 예상: index와 order이 순서대로 0~2까지 출력 될 것.
	}

}

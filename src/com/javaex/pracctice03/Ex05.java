package com.javaex.pracctice03;

public class Ex05 {

	public static void main(String[] args) {
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}
		//while(true)기 때문에 5까지 반복문이 실행되다가
		// 5가되면 if문의 조건에 성립되서 true가 false로 바뀌고 끝.
	}

}

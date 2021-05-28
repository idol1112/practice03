package com.javaex.pracctice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 1;
		for(int i=1;i<=num;i++) {
			sum = sum*i;
		}
		System.out.println("결과값: "+sum);
		
		sc.close();

	}

}

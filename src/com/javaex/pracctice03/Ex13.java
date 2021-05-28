package com.javaex.pracctice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum+i;
		}
		System.out.println("합계: "+sum);
		sc.close();
	}

}

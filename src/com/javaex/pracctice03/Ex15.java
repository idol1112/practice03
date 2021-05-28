package com.javaex.pracctice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}

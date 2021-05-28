package com.javaex.pracctice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();

	}

}

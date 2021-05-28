package com.javaex.pracctice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int hap = 0;
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%5==0) {
				count++;
				hap = hap+i;
			}
		}
		System.out.println("5의배수의 개수: "+count);
		System.out.println("5의배수의 합: "+hap);
		sc.close();

	}

}

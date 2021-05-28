package com.javaex.pracctice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		boolean bank = true;
		while(bank) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				System.out.print("예금액>");
				int deposit = sc.nextInt();
				balance = balance+deposit;
				break;
			case 2 :
				System.out.print("출금액>");
				int withdraw = sc.nextInt();
				balance = balance-withdraw;
				break;
			case 3 :
				System.out.println("잔고액>"+balance);
				break;
			case 4 :
				System.out.println("프로그램 종료");
				bank = false;
				break;
			default : 
				System.out.println("다시입력해주세요.");
			}
		}
		sc.close();
	}

}

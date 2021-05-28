package com.javaex.pracctice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*100);
		boolean game = true;
		System.out.println("=======================================");
		System.out.println("\t[숫자맞추기 게임 시작]");
		System.out.println("=======================================");
		
		while(game) {
			System.out.print(">>");
			int num = sc.nextInt();
			if(num<answer) {
				System.out.println("더 높게");
			}
			else if(num>answer) {
				System.out.println("더 낮게");
			}
			else if(num==answer) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				String exit = sc.next();
				if(exit.equals("y")) {
					System.out.println("=======================================");
					System.out.println("\t[숫자맞추기 게임 종료]");
					System.out.println("=======================================");
					game = false;
				}
			}
		}
		sc.close();

	}

}

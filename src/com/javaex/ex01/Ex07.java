package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 1;
        boolean run = true;
		
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("======================");
			System.out.println("   [숫자맞추기게임 시작]");
			System.out.println("======================");
			
		while (run) {	
			System.out.print(">>");

			int i = sc.nextInt();

			if (num > i) {
				System.out.println("더 높게");
			} else if (num < i) {
				System.out.println("더 낮게");
			} else
				System.out.println("맞았습니다.");
		}
			System.out.print("게임을 종요하시겠습니까?(y/n) >>");

			String j = sc.nextLine();

			if("n".equals(j)) {                                  //equals는 동등한지 비교!
              continue;                                          //continue n값과 같으면 한번 더 돈다.
			} else {
				System.out.println("====================");
				System.out.println("   [숫자맞추기게임 종료]   ");
				System.out.println("====================");
				break;
			}
		
		}
		sc.close();
	}

}
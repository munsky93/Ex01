package com.javaex.ex01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
		System.out.println("-----------------------------");
		
		
			System.out.print("선택>");
		
			
			int i = sc.nextInt();
			
			if(i==1) {
				System.out.println("예금액>");
				int j = sc.nextInt();	
			} else if(i==2) {
				System.out.println("출금액>");
				int a = sc.nextInt();
	     	} else if(i==3) {
	     		System.out.println("잔고액>800");
	     	} else {
	     		System.out.println("다시입력해주세요");
	     	} if(i==4) {
	     		System.out.println("프로그램 종료");
	            int c = sc.nextInt();
	     		break;
	     	}
	}
  }
}
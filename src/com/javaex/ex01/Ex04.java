package com.javaex.ex01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		
		int max = 0;
		
		for(int j=0; j<5; j++) {
			System.out.println("숫자");
			
			int i = sc.nextInt();
			
			if(i>max) {
			 max = i;
			}
			
		}
		
		System.out.println("최대값은 " + max + "입니다.");
	}

}

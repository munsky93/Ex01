package com.javaex.ex01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		int j;
		int k=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		
		int i = sc.nextInt();
		
		if(i%2 == 0) {
			j =2;
		} else {
			j =1;
		}
		
		for(int a=j; a<=i; a=a+2) {
			k = k+a;
		}
		System.out.println("결과값:" + k);
		
		sc.close();
	}
}

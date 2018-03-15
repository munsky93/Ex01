package com.javaex.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int i = sc.nextInt();
		int a, b;
		
		for(a = 1; a <= i; a++) {
		   for(b = 1; b <= i; b++) 
			
			if(a>=b) {
				System.out.print(a);
		}
           System.out.println("");		

	}
  }
}


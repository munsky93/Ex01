package com.javaex.ex01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		
		int max = 0;
		
		for(int j=0; j<5; j++) {
			System.out.println("����");
			
			int i = sc.nextInt();
			
			if(i>max) {
			 max = i;
			}
			
		}
		
		System.out.println("�ִ밪�� " + max + "�Դϴ�.");
	}

}

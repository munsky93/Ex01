package com.javaex.ex01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
		System.out.println("-----------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� |4.����");
		System.out.println("-----------------------------");
		
		
			System.out.print("����>");
		
			
			int i = sc.nextInt();
			
			if(i==1) {
				System.out.println("���ݾ�>");
				int j = sc.nextInt();	
			} else if(i==2) {
				System.out.println("��ݾ�>");
				int a = sc.nextInt();
	     	} else if(i==3) {
	     		System.out.println("�ܰ��>800");
	     	} else {
	     		System.out.println("�ٽ��Է����ּ���");
	     	} if(i==4) {
	     		System.out.println("���α׷� ����");
	            int c = sc.nextInt();
	     		break;
	     	}
	}
  }
}
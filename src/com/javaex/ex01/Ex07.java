package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 100) + 1;
        boolean run = true;
		
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("======================");
			System.out.println("   [���ڸ��߱���� ����]");
			System.out.println("======================");
			
		while (run) {	
			System.out.print(">>");

			int i = sc.nextInt();

			if (num > i) {
				System.out.println("�� ����");
			} else if (num < i) {
				System.out.println("�� ����");
			} else
				System.out.println("�¾ҽ��ϴ�.");
		}
			System.out.print("������ �����Ͻðڽ��ϱ�?(y/n) >>");

			String j = sc.nextLine();

			if("n".equals(j)) {                                  //equals�� �������� ��!
              continue;                                          //continue n���� ������ �ѹ� �� ����.
			} else {
				System.out.println("====================");
				System.out.println("   [���ڸ��߱���� ����]   ");
				System.out.println("====================");
				break;
			}
		
		}
		sc.close();
	}

}
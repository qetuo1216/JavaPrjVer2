package oop;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		Exam exam = new Exam();//� ������ ��üȭ�Ҷ� ��ȣ()�� �� ������� ��ü�� �ʱ�ȭ�� ���ؼ� ���
		int menu = 0;

		// 1���θŴ� ���, ����
		��: while (true) 
		{
			menu = inputMenu(menu);

			switch (menu) 
			{
				case 1:
					exam.input();
					break;
				case 2:
					exam.print();
					break;
				case 3:
					break ��;
			}

		}

	}

	// ��ü�� ������ ��Ÿ���� �ʱ� ������ �ٲ� �ʿ䰡 ����.
	public static int inputMenu(int menu) {
		
		Scanner scan = new Scanner(System.in);
		
				
		System.out.println("������������������������������������������������������������������");
		System.out.println("��      ���� �޴�                ��");
		System.out.println("������������������������������������������������������������������");

		System.out.println("\t 1.���� �Է�  ");
		System.out.println("\t 2.���� ���");
		System.out.println("\t 3.����");
		System.out.print("\t ���� > ");
		
		menu = scan.nextInt();
		
		return menu;
	}

}

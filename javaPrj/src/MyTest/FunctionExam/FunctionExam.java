package MyTest.FunctionExam;

import java.awt.Window;
import java.io.IOException;
import java.util.Scanner;

import Functions.Exam;

public class FunctionExam {
	public static void main(String[] args) {

		Exam[] exams = new Exam[3];
		
		for(int i=0;i<3;i++) {
			exams[i]= new Exam();
		}
		

		Scanner scan = new Scanner(System.in);

		�����ư���: while (true) {

			int menu=0;
			
			menu = print(menu);

			switch (menu) {

			case 1:input(exams);
				break;

			case 2:print(exams);
				break;

			case 3:
				break �����ư���;

			default:
				System.out.println("�߸��Ǿ����ϴ�. \n��ȣ�� 1���� 3������ ��밡��");
			}
		}
	}

	

	private static int print(int menu) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("������������������������������������������������������������������");
		System.out.println("��         ���� �޴�            ��");
		System.out.println("������������������������������������������������������������������");

		System.out.println("\t 1.���� �Է�  ");
		System.out.println("\t 2.���� ���");
		System.out.println("\t 3.����");
		System.out.print("\t ���� > ");
		menu = scan.nextInt();
		return menu;
	}



	private static void print(Exam[] exams) {
		// TODO Auto-generated method stub
		int total;
		float avg;

		System.out.println("������������������������������������������������������������������");
		System.out.println("��         ���� ���                                   ��");
		System.out.println("������������������������������������������������������������������");

		for (int i = 0; i < 3; i++) {
			int kor = 0;
			int eng = 0;
			int math = 0;
			
			kor = exams.;
			total = kor + eng + math;
			avg = total / 3.0f;
			System.out.printf("���� : %3d \n", kor);
			// �������� ���� ������ ǥ�Ⱑ ���� %d 10����, %c ����, %s ���ڿ�
			System.out.printf("���� : %3d \n", eng);
			System.out.printf("���� : %3d \n", math);
			System.out.printf("���� : %3d \n", total);
			System.out.printf("��� : %5.2f \n", avg);

		}
		
	}

	private static void input(Exam[] exams) {
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.println("������������������������������������������������������������������");
		System.out.println("��         ���� �Է�                                   ��");
		System.out.println("������������������������������������������������������������������");

		for (int i = 0; i < 3; i++) {
			do {
				if (kor < 0 || kor > 100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");

				System.out.print("\t���� :  \n");
				kor = scan.nextInt();
			} while (kor < 0 || kor > 100);

			do {
				if (eng < 0 || eng > 100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");

				System.out.print("\t���� :  \n");
				eng = scan.nextInt();
			} while (eng < 0 || eng > 100);

			do {
				if (math < 0 || math > 100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");

				System.out.print("\t���� :  \n");
				math = scan.nextInt();
			} while (math < 0 || math > 100);

			exams[i]. = kor;
			engs[i] = eng;
			maths[i] = math;
		}
		
	}
}

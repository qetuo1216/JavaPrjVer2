package MyTest.FunctionExam.A;

import java.util.Scanner;

public class ExamA {

	int kors;
	int engs;
	int maths;

	public static void printExam(ExamA[] exams) {

		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg;

		System.out.println("������������������������������������������������������������������");
		System.out.println("��    ���� ���                  ��");
		System.out.println("������������������������������������������������������������������");

		for (int i = 0; i < 3; i++) {
			kor = exams[i].kors;
			eng = exams[i].engs;
			math = exams[i].maths;

			total = kor + eng + math;
			avg = (float) total / 3;
			System.out.printf("���� : %3d \n", kor);
			// �������� ���� ������ ǥ�Ⱑ ���� %d 10����, %c ����, %s ���ڿ�
			System.out.printf("���� : %3d \n", eng);
			System.out.printf("���� : %3d \n", math);
			System.out.printf("���� : %3d \n", total);
			System.out.printf("��� : %5.2f \n", (float) avg);
		}

	}

	public static void inputExam(ExamA[] exams) {
		// TODO Auto-generated method stub
		// �߰�ȣ�� �־��ָ� ������ �����ֱⰡ ��������.
		Scanner scan = new Scanner(System.in);

		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.println("������������������������������������������������������������������");
		System.out.println("��         							���� �Է�                                   ��");
		System.out.println("������������������������������������������������������������������");

		// �ӽú����� ��ȿ�� �˻縦 �� �� ������ ���

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

			exams[i].kors = kor;
			exams[i].engs = eng;
			exams[i].maths = math;

		}

	}
}

package Functions;

import java.util.Scanner;

public class Hello5 {
	public static void main(String[] args) {
		// �������� ���α׷�
		/*
		 * int[] kors = new int[3]; int[] engs = new int[3]; int[] maths = new int[3];
		 */

		// Exam exam = new Exam();
		// �տ����� int�� ���� �ڷ������� �˰�����.
		Exam[] exams = new Exam[3];

		for (int i = 0; i < 3; i++) {
			exams[i] = new Exam();

		}
		int menu=0;

		// 1���θŴ� ���, ����
		��: while (true) {
			menu = inputMenu(menu);

			switch (menu) {
			case 1:
				inputExam(exams);
				break;
			case 2:
				printExam(exams);
				break;
			case 3:
				break ��;
			}

		}

		//
	}

	

	private static int inputMenu(int menu) {

		int kor = 0;
		int eng = 0;
		int math = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("������������������������������������������������������������������");
		System.out.println("��         							���� �Է�                                   ��");
		System.out.println("������������������������������������������������������������������");
		
		//�ӽú����� ��ȿ�� �˻縦 �� �� ������ ���
		
		
		for(int i=0;i<3;i++) {
			
			
			do{
			if(kor<0||kor>100)
				System.out.println("��ȿ���� ���� �����Դϴ�.");
			
			System.out.print("\t���� :  \n");
			kor = scan.nextInt();
			}while(kor<0||kor>100);
						
						
			do{
				if(eng<0||eng>100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");
				
				System.out.print("\t���� :  \n");
				eng = scan.nextInt();
			}while(eng<0||eng>100);
			
			
			do{
				if(math<0||math>100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");
				
				System.out.print("\t���� :  \n");
				math = scan.nextInt();
			}while(math<0||math>100);

			exams[i].kors = kor;
			engs[i] = eng;
			maths[i] = math;
			
			
	
		
		

		
		return menu;
	}



	public static void printExam(Exam[] exam) {

///////
		
		System.out.println("������������������������������������������������������������������");
		System.out.println("��         ���� ���             ��");
		System.out.println("������������������������������������������������������������������");
		
		for(int i= 0;i<3;i++){
			kor = kors[i];
			eng = engs[i];
			math = maths[i];
			
		total = kor + eng + math;
		avg = (float)total / 3;
		System.out.printf("���� : %3d \n", kor);
		// �������� ���� ������ ǥ�Ⱑ ���� %d 10����, %c ����, %s ���ڿ�
		System.out.printf("���� : %3d \n", eng);
		System.out.printf("���� : %3d \n", math);
		System.out.printf("���� : %3d \n", total);
		System.out.printf("��� : %5.2f \n", avg);

		}
		
		
		
		
		
		
		
		
		
		
		
		
/////////
	}

	public static void inputExam(Exam[] exam) {

		switch (menu) {

		case 1: { // �߰�ȣ�� �־��ָ� ������ �����ֱⰡ ��������.
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

				kors[i] = kor;
				engs[i] = eng;
				maths[i] = math;

			}

		}

		}
	}
}
//////
// �ҽ��� �ϼ���Ű�� ��!! ����

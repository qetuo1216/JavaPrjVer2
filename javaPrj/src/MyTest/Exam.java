package MyTest;

import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int math = 0;
		int kor = 0;
		int eng = 0;

		int menu = 0;
		exit:
		while (true) {
			System.out.println("������������������������������������������������");
			System.out.println("��       �Ŵ� �Է�      ��");
			System.out.println("\t1. ���� �Է�");
			System.out.println("\t2. ���� ���");
			System.out.println("\t3. ����");
				menu = scan.nextInt();
			
			switch (menu) {
			case 1: 

				System.out.println("�������� �Է� :");
				do {
					if (kor < 0 || kor > 100)
						System.out.println("�߸��Է��ϼ˽��ϴ�.");
					kor = scan.nextInt();
				} while (kor < 0 || kor > 100);
				

				System.out.println("�������� �Է� :");
				do {
					if (eng < 0 || eng > 100)
						System.out.println("�߸��Է��ϼ˽��ϴ�.");
					eng = scan.nextInt();
				} while (kor < 0 || kor > 100);
				

				System.out.println("�������� �Է� :");
				do {
					if (math < 0 || math > 100)
						System.out.println("�߸��Է��ϼ˽��ϴ�.");
					kor = scan.nextInt();
				} while (math < 0 || math > 100);
				
		

				break;
				
			case 2:

				int total = kor+eng+math;
				float avg = total/4.0f;
				System.out.println("���� :"+total);
				System.out.println("��� :"+avg);
				
				

			case 3:
				break exit;

			default:
				break;
			}

		}

	}

}

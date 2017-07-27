package opp.interf;

import java.util.Scanner;

import opp.interf.Exam;

public abstract class ExamConsole {

	// Ŭ���� �ȿ� ������ ���� �ʴ´�. �ʱ�ȭ�� ����. �ٵ� ������ ���� ��

	////////////////////////////////////////////////////////////////////
	// compossition : ���� - ��ü��
	// ��ü������ ��ü�� �����پ���.(�˾Ƽ� ������, �����(main)�� �Ű澵 �ʿ� x)

	private Exam exam = newExam();

	public abstract Exam newExam();

	/*
	 * ���� �̷��� �����ؾ���. private Exam exam;
	 * 
	 * public ExamConsole() { // -> // private Exam exam = new Exam(); // TODO
	 * Auto-generated constructor stub exam = new Exam(); }
	 */

	////////////////////////////////////////////////////////////////////////////////////////////////////
	// association : ���� - ������
	// ������: ��ǰ�� ���鶧 ���������� ������ ����.(������ �ܺο��� �Ͼ)
	/*
	 * private Exam exam;
	 * 
	 * //association : ���� - �����ڸ� �̿��ؼ� �ʿ��� �� ���� �ٲ� �� �ִ�.
	 *  public void setExam(Exam exam) { this.exam = exam; }
	 */

	////////////////////////////////////////////////////////////////////////////////////////////////////

	public void input() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// �߰�ȣ�� �־��ָ� ������ �����ֱⰡ ��������.

		// �ܺ� ���� �����ϴ� ���

		Scanner scan = new Scanner(System.in);

		System.out.println("������������������������������������������������������������������");
		System.out.println("��         	���� �Է�           ��");
		System.out.println("������������������������������������������������������������������");

		// �ӽú����� ��ȿ�� �˻縦 �� �� ������ ���

		int kor = 0;
		int eng = 0;
		int math = 0;

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
		//�߰� ���� �Է�
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		

	}

	

	//protected abstract void oninput(Exam exam);

	public void print() {
		int kor = exam.getKor();
		int math = exam.getMath();
		int eng = exam.getEng();

		System.out.println("������������������������������������������������������������������");
		System.out.println("��			���� ���           ��");
		System.out.println("������������������������������������������������������������������");

		int total;
		float avg;

		total = exam.total();// kor + eng + math;
		avg = exam.avg();// (float) total / 3;

		System.out.printf("���� : %3d \n", kor);
		System.out.printf("���� : %3d \n", eng);
		System.out.printf("���� : %3d \n", math);
		onoutput(exam);
		System.out.printf("���� : %3d \n", total);
		System.out.printf("��� : %5.2f \n", (float) avg);

	}

	protected abstract void onoutput(Exam exam);

}

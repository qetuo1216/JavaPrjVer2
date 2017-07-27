package oop;

import java.util.Scanner;

public class Exam {
	//private = ĸ���� �����ϴ� �������� �����.
	//ĸ���� ������ ���
	private int kor;
	private int eng;
	private int math;


	public Exam() {	// �������Լ� : ó���� �����ϸ� �ڵ����� 0���� �ʱ�ȭ�� �Ǵµ�, �ٸ� ���� �ʱ�ȭ�ϰ� ���� ��� ���
		/*
		kor =1;
		eng =1;
		math =1;
		*/// ���� ���� �ǹ̸� ���Ѵ�.
		this(1,1,1);
	}
	
	public Exam(int kor, int eng,int math) {	// �����ε� ������ �Լ� : ���� �̸��ε� ���ڰ� �ٸ� ��� ���
		this.kor =kor;							// �ڵ尡 �ߺ���. ����ȭ�� ��������. 
		this.eng = eng;
		this.math = math;
		
	}

	public void input() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// �߰�ȣ�� �־��ָ� ������ �����ֱⰡ ��������.
		Scanner scan = new Scanner(System.in);

		System.out.println("������������������������������������������������������������������");
		System.out.println("��         	���� �Է�           ��");
		System.out.println("������������������������������������������������������������������");

		// �ӽú����� ��ȿ�� �˻縦 �� �� ������ ���

		do 
		{
			if (kor < 0 || kor > 100)
				System.out.println("��ȿ���� ���� �����Դϴ�.");

			System.out.print("\t���� :  \n");
			kor = scan.nextInt();
		} while (kor < 0 || kor > 100);

		do 
		{
			if (eng < 0 || eng > 100)
				System.out.println("��ȿ���� ���� �����Դϴ�.");

			System.out.print("\t���� :  \n");
			eng = scan.nextInt();
		} while (eng < 0 || eng > 100);

		do 
		{
			if (math < 0 || math > 100)
				System.out.println("��ȿ���� ���� �����Դϴ�.");

			System.out.print("\t���� :  \n");
			math = scan.nextInt();
		} while (math < 0 || math > 100);

	}

	public void print() {

		System.out.println("������������������������������������������������������������������");
		System.out.println("��			���� ���           ��");
		System.out.println("������������������������������������������������������������������");

		int total;
		float avg;

		total = kor + eng + math;
		avg = (float) total / 3;
		
		System.out.printf("���� : %3d \n", kor);
		System.out.printf("���� : %3d \n", eng);
		System.out.printf("���� : %3d \n", math);
		System.out.printf("���� : %3d \n", total);
		System.out.printf("��� : %5.2f \n", (float) avg);

	}

}

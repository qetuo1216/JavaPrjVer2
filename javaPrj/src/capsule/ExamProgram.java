package capsule;

import java.util.Scanner;

public class ExamProgram {






	public static void main(String[] args) {
		//�������� ���α׷�
/*		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];*/
		
		//Exam exam = new Exam();
		//�տ����� int�� ���� �ڷ������� �˰�����.
		Exam[] exams = new Exam[3];
		
		for(int i=0;i<3;i++)
		{
			exams[i] = new Exam();
		}
		
		int menu = 0;
		
		
		//1���θŴ� ���, ����
		��:
		while(true)
		{
			menu = inputMenu(menu);
			
			
			switch(menu)
			{
			case 1:
				Exam.input(exams);
				break;
			case 2:
				Exam.print(exams);
				break;
			case 3:
				break ��;
			}
			
			
		}
		
		
		
		
	}

	public static int inputMenu(int menu) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
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
	




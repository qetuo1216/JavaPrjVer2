package MyTest.FunctionExam.A;

import java.util.Scanner;

public class ExamProgramA {






	public static void main(String[] args) {
		//�������� ���α׷�
/*		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];*/
		
		//Exam exam = new Exam();
		//�տ����� int�� ���� �ڷ������� �˰�����.
		ExamA[] exams = new ExamA[3];
		
		for(int i=0;i<3;i++)
		{
			exams[i] = new ExamA();
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
				ExamA.inputExam(exams);
				break;
			case 2:
				ExamA.printExam(exams);
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
		System.out.println("��         					   ���� �޴�                                    ��");
		System.out.println("������������������������������������������������������������������");

		System.out.println("\t 1.���� �Է�  ");
		System.out.println("\t 2.���� ���");
		System.out.println("\t 3.����");
		System.out.print("\t ���� > ");
		menu = scan.nextInt();
		return menu;
	}




	}
	




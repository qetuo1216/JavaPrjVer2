package MyTest;

import java.io.IOException;
import java.util.Scanner;

public class arrayExam {
	public static void main(String[] args) {

			int kors[] = new int[3];
			int engs[] = new int[3];
			int maths[] = new int[3];

			Scanner scan = new Scanner(System.in);
			// ������� ������ ���������� ���� ����

			/*
			 * //System.out.println(total); //System.out.println(avg); System.out.write(51);
			 * System.out.write(52); System.out.write(53); //���۰� ���� ũ���϶� ����� �ϰԵ�
			 * System.out.write('3'); System.out.write('3'+1); System.out.write('3'+2);
			 * //''�� ���θ� �ű� ���� �ڵ带 �˷��޶�� �ǹ��̴�. //3 ���� '3'���ڰ� System.out.flush(); //���۰� ����
			 * ũ���϶� write�� �ڵ带 ����� �ϰԵ�. ���ڰ� �ƴ϶� ������ �ǹ̸� �������ִ�.(����)
			 */
			�����ư��� :
			while (true) 
			{
				
				
				
				int menu;
				
				System.out.println("������������������������������������������������������������������");
				System.out.println("��         ���� �޴�            ��");
				System.out.println("������������������������������������������������������������������");

				System.out.println("\t 1.���� �Է�  ");
				System.out.println("\t 2.���� ���");
				System.out.println("\t 3.����");
				System.out.print("\t ���� > ");
				menu = scan.nextInt();
				

				switch(menu)
				{
				

				
				case 1:
					int kor = 0;
					int eng = 0;
					int math = 0;
					
					System.out.println("������������������������������������������������������������������");
					System.out.println("��         ���� �Է�                                   ��");
					System.out.println("������������������������������������������������������������������");
					
					for(int i=0;i<3;i++)
					{
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
						
						kors[i]= kor;
						engs[i]=eng;
						maths[i]= math;
					}
					
					break;
				
				case 2:
				
					int total;					
					float avg;
					
					System.out.println("������������������������������������������������������������������");
					System.out.println("��         ���� ���                                   ��");
					System.out.println("������������������������������������������������������������������");
					
					for(int i= 0;i<3;i++){
					kor = kors[i];
					eng = engs[i];
					math = maths[i];
					total = kor + eng + math;
					avg = total / 3.0f;
					System.out.printf("���� : %3d \n", kor);
					// �������� ���� ������ ǥ�Ⱑ ���� %d 10����, %c ����, %s ���ڿ�
					System.out.printf("���� : %3d \n", eng);
					System.out.printf("���� : %3d \n", math);
					System.out.printf("���� : %3d \n", total);
					System.out.printf("��� : %5.2f \n", avg);
				
					}
					break;
				

				case 3:
					break �����ư���;
					
				default:
					System.out.println("�߸��Ǿ����ϴ�. \n��ȣ�� 1���� 3������ ��밡��");
				}
			}
		}
	}


package capsule;

import java.util.Scanner;

public class testProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5���� Ű�� ����� ���϶�\
		
		Scanner scan = new Scanner(System.in);
		
		int menu=0;		
		test[] tall = new test[5];
		
		for(int i=0;i<5;i++) 
		{
			tall[i] = new test();
		}
		
		//�Ŵ�
		System.out.println("������������������������������������������������������������������");
		System.out.println("��         					   ���� �޴�                                    ��");
		System.out.println("������������������������������������������������������������������");
		
		System.out.println("\t 1.���� �Է�  ");
		System.out.println("\t 2.���� ���");
		System.out.println("\t 3.����");
		System.out.print("\t ���� > ");
		menu = scan.nextInt();
		
		end:
		while(true) {
			switch(menu) {
				case 1:
					
					int count = 5;
					for(int i=0;i<5;i++) 
					{	
						
						printf("Ű�� �Է��ϼ���!! %d�� ����",count-i);
					}
								
					break;
				case 2:
					
					
					break;
				case 3:
					
					
					break end;
			}
			
			
		}
		
		//Ű�� �Է� ����
		
		
		//��� ��
	}

	private static void printf(String string, int i) {
		// TODO Auto-generated method stub
		
	}

}

package Functions;

import java.io.IOException;
import java.util.Scanner;

class �̿��� {
	public static void main(String[] args) throws IOException {
		int num = 0;
		int count = 0;
		int total= 0;
		float avg = 0;
		int select=1;
		Scanner scan = new Scanner(System.in);

	
		System.out.println("������������������������������������������������������������������");
		System.out.println("��         ������ �Է��ϼ���                       ��");
		System.out.println("������������������������������������������������������������������");
		
		
		
		��:
		while(true)
		{
			switch(select)
			{
			case 0:

				System.out.printf("���� : %d, ��� : %6.2f",total,avg);
				break ��;
			case 1:
				
				do{
					
					if(num<0||num>100)
						System.out.println("��ȿ���� ���� �����Դϴ�.");
					System.out.print("\t���� :  \n");
					num = scan.nextInt();
				}while(num<0||num>100);
				count += 1;
				total += num;
				avg= total/count;
				System.out.printf("%d���� �Է��Ͽ����ϴ�. ����Ͻðڽ��ϱ�? ��:1 �ƴϿ�:0",num);
				
				do{
					
					if(select<0||select>1)
						System.out.println("��ȿ���� ���� �����Դϴ�.");
					select = scan.nextInt();
				}while(select<0||select>1);
				
				break;
				
			
			
			
			}
		}
	}

}

package reuse;

import java.util.Scanner;

public class OmokLib {
	//private�� ��ȣ��� Ŭ���� ���ʿ����� ����� �����ϴ�. 
	//�ۿ����� �Ұ���
	public static void printBoard(Omok omok) {
		int ox = omok.x;
		int oy = omok.y;
		//�����ϰ� ����!!
		for(int y=0; y<15; y++)
		{
			for(int x=0; x<20; x++) 
				if(x == ox && y == oy)
				System.out.print("��");
			else
				System.out.print("��");
		
			System.out.println();
		}
		
	}

	public static void input(Omok omok) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x sp y : ");
		omok.x = scan.nextInt();
		omok.y = scan.nextInt();
		//���������ϱ� �׳� ���°� ���ϴ�.
	}





	public static void printBoard() 
	{
		for(int y=0; y<15; y++)
		{
			for(int x=0; x<20; x++) 
			System.out.print("��");
			
			System.out.println();
		}
		
	}
	
}

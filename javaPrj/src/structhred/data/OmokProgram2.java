package structhred.data;

import java.util.Scanner;

	public class OmokProgram2 {
		
	public static void main(String[] args) {
	//�����ؾߵǴ� ���� �����͸� ����
		
		//int ox=0, oy=0;
		Omok omok = new Omok(); //�̷� �ڷ����� ���� 10���� �ּҸ� ���尡���� ������ ����.(�ּҹ迭�� ����, �� ����Ұ���) = ��������
		//��ü �� 10�� ����ٰ� ��������.!!!(��Ī ��������!)
		

	
		//�� ������ ������ �� �ִ� ����
		//Omok omok=new Omok();//������ �����͸� ����
		//�����߿� ��������� ���� = ���� �����Ҵ�.
		//�⺻���� �ƴϸ� �ּҸ� �����Ѵ� �����̱⶧���� �ݵ�� new�� ���������� ��� ����	(�ν��Ͻ�ȭ)
		//������ ������� �ʴ� ��� null�� ����.													Omok omok=null;
		//
		
		printBoard();	
		input(omok);		
		printBoard(omok);
			
	


	}

	private static void printBoard(Omok omok) {
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

	private static void input(Omok omok) {
		Scanner scan = new Scanner(System.in);
		

		
		System.out.print("x sp y : ");
		omok.x = scan.nextInt();
		omok.y = scan.nextInt();
		
		
	}





	private static void printBoard() 
	{
		for(int y=0; y<15; y++)
		{
			for(int x=0; x<20; x++) 
			System.out.print("��");
			
			System.out.println();
		}
		
	}
}
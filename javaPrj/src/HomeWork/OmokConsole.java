package HomeWork;

import java.util.Scanner;

public class OmokConsole extends Omok{
	  private Omok omok;
	  
	
	   public void setOmok(Omok omok) 
	   { 
		   this.omok = omok;  
	   }
	   
	   public void print() {
			int ox = x;
			int oy = y;
			// �����ϰ� ����!!
			for (int y = 0; y < 15; y++) {
				for (int x = 0; x < 20; x++)
					if (x == ox && y == oy)
						System.out.print("��");
					else
						System.out.print("��");

				System.out.println();
			}

		}

		public void input() {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);

			System.out.print("x sp y : ");
			x = scan.nextInt();
			y = scan.nextInt();
			// ���������ϱ� �׳� ���°� ���ϴ�.

		}
}

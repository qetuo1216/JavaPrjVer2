package HomeWork.omok;

import java.util.Scanner;

public class Omok {
	// 2������ ��� �� �����͸� �����ϱ� ���� �뵵�ν� ���

	// �����̶� ���� �Ӽ��� ����(�� �����ϸ� x) �ʱ�ȭ�� x
	static int x, y;

	public Omok(int x, int y) {// �ʱ�ȭ �Լ�
		this.x = x;
		this.y = y;
	

	}

	public Omok() {// �����ε� �ʱ�ȭ �Լ�
		this(0, 0);

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
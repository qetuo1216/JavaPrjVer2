package reuse.copy;

public class OmokProgram {

	public static void main(String[] args) {
		// �����ؾߵǴ� ���� �����͸� ����

		// int ox=0, oy=0;
		Omok omok = new Omok();

		// �⺻���� �ƴϸ� �ּҸ� �����Ѵ� �����̱⶧���� �ݵ�� new�� ���������� ��� ���� (�ν��Ͻ�ȭ)
		// ������ ������� �ʴ� ��� null�� ����. Omok omok=null;
		//
		omok.print();

		omok.input();

		omok.print();

	}

	public static void printBoard() {
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				System.out.print("��");

			System.out.println();
		}

	}

}
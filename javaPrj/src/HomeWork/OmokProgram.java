package HomeWork;

public class OmokProgram {

	public static void main(String[] args) {
		// �����ؾߵǴ� ���� �����͸� ����

		// int ox=0, oy=0;
		Omok omok = new Omok();
		OmokConsole console = new OmokConsole();
		console.setOmok(omok);
		
		// �⺻���� �ƴϸ� �ּҸ� �����Ѵ� �����̱⶧���� �ݵ�� new�� ���������� ��� ���� (�ν��Ͻ�ȭ)
		// ������ ������� �ʴ� ��� null�� ����. Omok omok=null;
		//
		console.print();

		console.input();

		console.print();

	}

	

	

}
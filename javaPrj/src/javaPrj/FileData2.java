package javaPrj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileData2 {

	public static void main(String[] args) throws IOException {
		//api ����� �߿��� ���� ������� ����Ѵ�.
		int[] nums= new int[] {23,34,65,23,2,34,4};
		//�� ���� �ƴ϶� {}�� �Ἥ ���� ä���� �迭�� ������ �� �ִ�.
		
		

		FileInputStream filein = new FileInputStream("res/data.txt");	//�����-���� �߽����� src��θ� ����
		//FileOutputStream file = new FileOutputStream("C:/workspace/data.txt");	//������
		//���� �Է¿� ���̴� ��Ʈ�� ��ü
		
		Scanner scan = new Scanner(filein);
		//���� �Է� ��ü�� �̿��ϴ� ��ĵ�� ����
		//���� ������ �����͸� ���� �� ���
		
		int num;
		while((num = filein.read())!= -1)
				System.out.println(num);
		
		
		scan.close();
		filein.close();
		
		
		
		
		
		
		
		
		/*
		 * 
		FileOutputStream file = new FileOutputStream("res/data.txt");	//�����-���� �߽����� src��θ� ����
		//							 = new FileOutputStream("C:/workspace/data.txt");	//������
		//���� ���忡 ���̴� ��Ʈ�� ��ü
		PrintStream print = new PrintStream(file);
		//��¿� ���̴� ��Ʈ�� ��ü, ������ �߻��� �� �ֱ⶧���� ���۰� �ʿ��ϴ�.
		 * 
		 */
		/*
		 * 
		for(int i=0;i<7;i++)
			file.write(nums[i]);					//���� �״�� ����(���̳ʸ�), ���ڴ� �̰ɷ� �����ϴ� ���� ȿ�����̴�.
		 //printer.printf("%d ", nums[i]);	//���ڿ��� ��ȯ�Ͽ� �����ϴ� ��

		
		
		print.close();
		file.close();
		//������ ������Դϴ�. ������ ���� �ʵ��� �ݾƾ��ϴµ�
		//����� �ݱ�.
		 * 
		*/
		
		
		System.out.println("�Ϸ�");
		
		//����������� ������ �߻��� �� �ֱ⶧���� ���۰� �ʿ��ϴ�.
		//System.out ��ſ� file�� ��Ʈ�� ��ü�� �����Ѵ�.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

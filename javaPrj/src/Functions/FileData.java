package Functions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileData {

	public static void main(String[] args) throws IOException {
		//api ����� �߿��� ���� ������� ����Ѵ�.
		int[] nums= new int[] {23,34,65,23,2,34,4};
		//�� ���� �ƴ϶� {}�� �Ἥ ���� ä���� �迭�� ������ �� �ִ�.
		
		
		FileOutputStream file = new FileOutputStream("res/data.txt");	//�����-���� �߽����� src��θ� ����
		//FileOutputStream file = new FileOutputStream("C:/workspace/data.txt");	//������
		//���� ���忡 ���̴� ��Ʈ�� ��ü
		PrintStream print = new PrintStream(file);
		//��¿� ���̴� ��Ʈ�� ��ü, ������ �߻��� �� �ֱ⶧���� ���۰� �ʿ��ϴ�.
		
		
		for(int i=0;i<7;i++)
			file.write(nums[i]);					//���� �״�� ����(���̳ʸ�), ���ڴ� �̰ɷ� �����ϴ� ���� ȿ�����̴�.
		 //printer.printf("%d ", nums[i]);	//���ڿ��� ��ȯ�Ͽ� �����ϴ� ��


		
		
		print.close();
		file.close();
		//������ ������Դϴ�. ������ ���� �ʵ��� �ݾƾ��ϴµ�
		//����� �ݱ�.
		
		System.out.println("�Ϸ�");
		
		//����������� ������ �߻��� �� �ֱ⶧���� ���۰� �ʿ��ϴ�.
		//System.out ��ſ� file�� ��Ʈ�� ��ü�� �����Ѵ�.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

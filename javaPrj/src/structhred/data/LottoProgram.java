package structhred.data;

import java.util.Random;

public class LottoProgram {


		
	public static void main(String[] args) {
		
	//	int[] nums = new int[6];
		Lotto lotto = new Lotto();
		
		Random rand = new Random();	//�����̶� �ϴ� ��ü ����
		
		//1 �ζǹ�ȣ ����
		gen(lotto);
		
		//2 �ζǹ�ȣ ���
		print(lotto);
		
		//3 ����
		sort(lotto);
		
		//4 ���
		print(lotto);
		
		
		
	}

	private static void sort(Lotto lotto) {		
		int[] nums = new int[6];
		nums = lotto.nums;
		
		for(int j=0;j<5;j++)
		{
			int temp;
			
			for(int i=0;i<5-j;i++)
			{
				if(nums[i]>nums[i+1])
				{
					temp= nums[i];
					nums[i]= nums[i+1];
					nums[i+1] = temp;
				}	//���� ū 1���� �̾Ҵ�.
			}
		}
		
		
	}

	private static void print(Lotto lotto) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",lotto.nums[i]);
			
		}
		System.out.println();
		
	}

	private static void gen(Lotto lotto) {
		// TODO Auto-generated method stub

		Random rand = new Random();	//�����̶� �ϴ� ��ü ����
		for(int i=0;i<6;i++)
		{
			lotto.nums[i] = rand.nextInt(45)+1;		//���������� ����(1~45)�� �̴´�.
		}
		
	}


}

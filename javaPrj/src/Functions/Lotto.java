package Functions;

import java.util.Random;

public class Lotto {


		
	public static void main(String[] args) {
		
		int[] nums = new int[6];
		
		Random rand = new Random();	//�����̶� �ϴ� ��ü ����
		
		//ó������ ū �׸��� �׸���.
		//ī��ǥ������� �Լ��� ������ �� �翩����κп� �빮�ڸ� ���ش�.
		//1 �ζǹ�ȣ ����  = ��µǴ� �� �Լ�(�Է°�){              } // �̰� �������� ����
		genLotto(nums);
		
		//2 �ζǹ�ȣ ���
		printLotto(nums);
		
		//3 ����
		sortLotto(nums);
		
		//4 ���
		printLotto(nums);
		
		
		/*
		//����1. �ζǹ�ȣ ����
		for(int i=0;i<6;i++)
		{
			nums[i] = rand.nextInt(45)+1;		//���������� ����(1~45)�� �̴´�.
		}
		

		//�ζ� ��ȣ ���
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
			
		}
		System.out.println();
				
		//2. �������� ����
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
		
		
		//3. �ζǹ�ȣ ���
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
		}
		*/
	}

	private static void sortLotto(int[] nums) {		
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

	private static void printLotto(int[] nums) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
			
		}
		System.out.println();
		
	}

	private static void genLotto(int[] nums) {
		// TODO Auto-generated method stub

		Random rand = new Random();	//�����̶� �ϴ� ��ü ����
		for(int i=0;i<6;i++)
		{
			nums[i] = rand.nextInt(45)+1;		//���������� ����(1~45)�� �̴´�.
		}
		
	}


}

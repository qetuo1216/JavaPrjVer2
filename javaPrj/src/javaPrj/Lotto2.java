package javaPrj;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[6];
		
		Random rand = new Random();	//�����̶� �ϴ� ��ü ����
		
		for(int i=0;i<6;i++)
		{
			nums[i] = rand.nextInt(45)+1;		//���������� ����(1~45)�� �̴´�.
			for(int j=0;j<6;j++)
			{
				if(nums[i]==nums[j])
				nums[i]=rand.nextInt(45)+1;	
				else break;
			}
		}
		

		//�ʱ������ �ζ�
		
		

	System.out.println("��ħ ���� :");
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
			
		}
		System.out.println();
		
		//��������
		
		
		
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
		}//���� ���� ����
		
		System.out.println("���� ���� :");
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
		}
		
		
		
		
		
		for(int j=0;j<5;j++)
		{
			
			for(int i=0;i<5-j;i++)
			{
				if(nums[i]==nums[i+1])
				{
					nums[j] = rand.nextInt(45)+1;	
				}	
			}
		}//���� ���� ����
		
		
		
		
		
		
	}

}

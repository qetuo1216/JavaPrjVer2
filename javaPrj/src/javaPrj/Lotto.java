package javaPrj;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[6];
		
		Random rand = new Random();	//�����̶� �ϴ� ��ü ����
		
		for(int i=0;i<6;i++)
		{
			nums[i] = rand.nextInt(45)+1;		//���������� ����(1~45)�� �̴´�.
		}
		

		//�ʱ������ �ζ�
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
			
		}
		System.out.println();
		
		//���� ����???
		//���� [0] ���ڸ� > [1]���ڸ�
		
/*		
 		temp= nums[0];
		nums[0]= nums[1];
		nums[1] = temp;
*/
		
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
		
		
		//�ʱ������ �ζ�
		for(int i=0;i<6;i++)
		{
			System.out.printf("\t%d",nums[i]);
		}
		
	}

}

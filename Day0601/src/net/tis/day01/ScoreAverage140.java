package net.tis.day01;

public class ScoreAverage140 {
	public static void main(String[] args) {
		//140������ �ϴ� ������ 
		double[][] score = {
				{7.3, 2.8, 2.7}, //0�� 3��
				{3.4, 3.5, 3.6, 9.1, 8.8}, //1�� 5��
				{7.1}, //2�� 1��
				{4.1, 4.2}  //3�� 2�� 
		}; 
		
		//2�����迭���� �迭��[��]  �迭���ּ�
		//2���� ù��° for ��ݺ�
		//2���� �ι�° for ���ݺ�
		//2���� �迭����Ҷ� ������� ���ΰ��� 
		for(int year=0; year<score.length; year=year+1) {
			for (int j=0; j<score[year].length; j++) {
				System.out.print(score[year][j] + "\t");
			}
			System.out.println(); //������� ���ΰ���
		}//year end
		
		
		System.out.println("\n������ 50 56 58");
	}//main end
}// class END


//���������ּ� /*  */
/*
		//2�����迭���� �迭��[��]  �迭���ּ�
		//2���� ù��° for ��ݺ�
		//2���� �ι�° for ���ݺ�
		for(int year=0; year<score.length; year=year+1) {
			//System.out.print(score[year]); �迭���ּ����
		}//year end 
*/



package net.tis.day01;

public class ScoreAverage {
	public static void main(String[] args) {
		//140페이지 차원배열 4행*3열
		double[][] score = {
				{7.3, 2.8, 2.7},
				{3.4, 3.5, 3.6},
				{7.1, 7.2, 7.9},
				{4.1, 4.2, 9.4}
		}; 
		
		//2차원배열에서 배열명[행]  배열의주소
		//2차원 첫번째 for 행반복
		//2차원 두번째 for 열반복
		//2차원 배열출력할때 행단위로 라인개행 
		for(int year=0; year<score.length; year=year+1) {
			for (int j=0; j<score[year].length; j++) {
				System.out.print(score[year][j] + "\t");
			}
			System.out.println(); //행단위로 라인개행
		}//year end
		
		
		System.out.println("\n영수증 50 56 58");
	}//main end
}// class END


//여러라인주석 /*  */
/*
		//2차원배열에서 배열명[행]  배열의주소
		//2차원 첫번째 for 행반복
		//2차원 두번째 for 열반복
		for(int year=0; year<score.length; year=year+1) {
			//System.out.print(score[year]); 배열행주소출력
		}//year end 
*/



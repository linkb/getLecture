package net.tis.day01;

public class SkewedArray {
	public static void main(String[] args) {
		//142페이지  비정형예제 
		int[][] intArray = new int[4][]; //행고정
		intArray[0] = new int[3];
		intArray[1] = new int[5];
		intArray[2] = new int[1];
		intArray[3] = new int[2];
		
		intArray[0][2]=7;
		intArray[1][1]=5;
		intArray[2][0]=9;
		intArray[3][1]=4;
		
		for(int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j] + "  ");
			}
			System.out.println(); 
		}//year end
		
	}//main end
}// class END


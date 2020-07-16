package net.tis.day01;

import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		int dan=1;
		Scanner sc = new Scanner(System.in) ; //Scanner클래스라서 초기값 null

	  //Ctrl + Shift + f
		//왼쪽으로 내어쓸때 shift + Tab키
		//오른쪽으로 들여쓸때 Tab키
		System.out.print("단 입력 >>> ");
		dan = sc.nextInt(); 
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		
		System.out.println("\n총점=175");
		System.out.println("평균=87.5");
		System.out.println("영수증출력");
	  sc.close(); 
	}//main end
}// Gugudan2 class END









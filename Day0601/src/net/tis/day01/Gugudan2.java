package net.tis.day01;

import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		int dan=1;
		Scanner sc = new Scanner(System.in) ; //ScannerŬ������ �ʱⰪ null

	  //Ctrl + Shift + f
		//�������� ����� shift + TabŰ
		//���������� �鿩���� TabŰ
		System.out.print("�� �Է� >>> ");
		dan = sc.nextInt(); 
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		
		System.out.println("\n����=175");
		System.out.println("���=87.5");
		System.out.println("���������");
	  sc.close(); 
	}//main end
}// Gugudan2 class END









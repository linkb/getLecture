package net.tis.day01;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		int dan=1;
		Scanner sc = new Scanner(System.in) ; //Scanner클래스라서 초기값 null

	int i=0;
	while(true) {
		System.out.print("단 입력 >>> ");
		
		try {	
			dan=sc.nextInt(); //무한루프 
			//dan=Integer.parseInt(sc.nextLine()); 
			//숫자입력 enter치면 enter키값이 다시 dan변수대입
      if(dan==0 || dan ==-1) {
      	System.out.println("구구단 프로그램을 종료합니다");
      	System.exit(1); //완전종료 terminated JVM 
      }
			
			for(i=1; i<10; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
			break; //생략하면 문법에러 while(true){ }
		}catch(Exception ex) {
			System.out.println("정수형 숫자를 입력하세요\n");
			continue; //생략가능
		}
	}//while end
		
		System.out.println("\n총점=175");
		System.out.println("평균=87.5");
		System.out.println("영수증출력");
	  sc.close(); //Scanner 마지막 close권장
	}//main end
}// class END









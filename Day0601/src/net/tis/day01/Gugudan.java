package net.tis.day01;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		int dan=1;
		Scanner sc = new Scanner(System.in) ; //ScannerŬ������ �ʱⰪ null

	int i=0;
	while(true) {
		System.out.print("�� �Է� >>> ");
		
		try {	
			dan=sc.nextInt(); //���ѷ��� 
			//dan=Integer.parseInt(sc.nextLine()); 
			//�����Է� enterġ�� enterŰ���� �ٽ� dan��������
      if(dan==0 || dan ==-1) {
      	System.out.println("������ ���α׷��� �����մϴ�");
      	System.exit(1); //�������� terminated JVM 
      }
			
			for(i=1; i<10; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
			break; //�����ϸ� �������� while(true){ }
		}catch(Exception ex) {
			System.out.println("������ ���ڸ� �Է��ϼ���\n");
			continue; //��������
		}
	}//while end
		
		System.out.println("\n����=175");
		System.out.println("���=87.5");
		System.out.println("���������");
	  sc.close(); //Scanner ������ close����
	}//main end
}// class END









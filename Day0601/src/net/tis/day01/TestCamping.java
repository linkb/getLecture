package net.tis.day01;

import java.util.Scanner;

public class TestCamping{
	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
 boolean[] camp = new boolean[5]; // 0��° 1��° 2��° 3��° 4��°
 int sel=9, num=0;
 
 //ķ���� �������Ȯ�� 
 for(int i=0; i<camp.length; i++) {
	 if(camp[i]==true) {
	  System.out.println("  "+(i+1)+"��° ��ķ��������Դϴ� ");
	 }else {
	  System.out.println("  "+(i+1)+"��° ��ķ������ ��� �ֽ��ϴ�"); 
	 }
 } //for end
 
 
	while(true) {
		try {
		  System.out.print("\n1.����  2.���  3.����  9.���� : ");
		  sel = Integer.parseInt(sc.nextLine());
		     
		  switch(sel) {
		    case 1: 
			    System.out.print("����ķ�ι�ȣ �Է�>>> ");
			    num=Integer.parseInt(sc.nextLine());
			    if(camp[num-1]==true) {
			    	System.out.println("�̹� ����� ķ���� ����Ҽ� �����ϴ�");
			    }else {
			    	System.out.println("camp["+num+"] ķ���� ���༺��");
			    	camp[num-1]=true; 
			    }
			    
			    for(int i=0; i<camp.length; i++) {
					 if(camp[i]==true) {
					   System.out.println("  "+(i+1)+"��° ��ķ��������Դϴ� ");
					 }else {
					   System.out.println("  "+(i+1)+"��° ��ķ������ ��� �ֽ��ϴ� "); 
					 }
				 } //for end
		     break;
		    	
		    case 2: //���κ�ó��
		    	System.out.print("���ķ�ι�ȣ �Է�>>> ");
		    	num=Integer.parseInt(sc.nextLine());
				    if(camp[num-1]==true) {
				    	System.out.println("camp["+num+"] ķ���� ��Ǽ����߽��ϴ�");
				    	camp[num-1]=false; 
				    }else {
				    	System.out.println("camp["+num+"] ����ִ� ķ�����Դϴ�");
				    }
				    
				    for(int i=0; i<camp.length; i++) {
						 if(camp[i]==true) {
						   System.out.println("  "+(i+1)+"��° ��ķ��������Դϴ� ");
						 }else {
						   System.out.println("  "+(i+1)+"��° ��ķ������ ��� �ֽ��ϴ� "  ); 
						 }
					 } //for end    
		        break;	
		    case 3: //��ü�������
		    	 for(int i=0; i<camp.length; i++) {
		    		 if(camp[i]==true) {
		    		   System.out.println("  "+ (i+1)+"��° ��ķ��������Դϴ� "  );
		    		 }else {
		    		   System.out.println("  "+ (i+1)+"��° ��ķ������ ��� �ֽ��ϴ� "  ); 
		    		 }
		    	 } //for end
		    	break;
		    case 9: //����
		    	System.out.println("ķ���忹�����α׷��� �����մϴ�");
		    	break;
		    default: 
		    	System.out.println("1~3�޴��� �����ϼž� �մϴ�");
		    	break;	
		  }//switch end
		}catch (Exception e) {	}
		
		if(sel==9) { break;}
	}//while 
	
	sc.close();
	}//main end
}//TestCamping class END









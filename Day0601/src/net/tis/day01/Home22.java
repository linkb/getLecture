package net.tis.day01;

import java.util.Scanner;

public class Home22{
 public static void main(String[] args) {
		
  Scanner sc =  new Scanner(System.in);
  boolean[] camp = new boolean[5]; 
  int sel=0, num=0;
 
 //1�����迭�� ����ó�� ķ���� �������Ȯ�� 
 for(int i=0; i<camp.length; i++) {
	 if(camp[i]==true) {
	  System.out.println("  "+(i+1)+"��° ��ķ��������Դϴ� ");
	 }else {
	  System.out.println("  "+(i+1)+"��° ��ķ������ ��� �ֽ��ϴ�"); 
	 }
 } //for end
 
 
	while(true) {
		try {
		  System.out.print("\n1.����  2.���  3.����  9.���� >> ");
		  sel=Integer.parseInt(sc.nextLine());
		  
		  if(sel==9) {
		  	System.out.println("ķ���� ���α׷� �����մϴ�");
		  	break;
		  }
		  
			switch(sel) { //switch������ if ~ else if ~ else if ~ else
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
		    	
		    default: 
		    	System.out.println("1~3�޴��� �����ϼž� �մϴ�");
		    	break;	
		 }//switch end
	 }catch (Exception e) {	}
 }//while 
	  
	sc.close();
 }//main end
}//Home22 class END









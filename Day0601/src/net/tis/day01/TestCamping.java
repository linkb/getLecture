package net.tis.day01;

import java.util.Scanner;

public class TestCamping{
	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
 boolean[] camp = new boolean[5]; // 0번째 1번째 2번째 3번째 4번째
 int sel=9, num=0;
 
 //캠핑장 예약상태확인 
 for(int i=0; i<camp.length; i++) {
	 if(camp[i]==true) {
	  System.out.println("  "+(i+1)+"번째 ■캠프사용중입니다 ");
	 }else {
	  System.out.println("  "+(i+1)+"번째 □캠프장은 비어 있습니다"); 
	 }
 } //for end
 
 
	while(true) {
		try {
		  System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
		  sel = Integer.parseInt(sc.nextLine());
		     
		  switch(sel) {
		    case 1: 
			    System.out.print("예약캠핑번호 입력>>> ");
			    num=Integer.parseInt(sc.nextLine());
			    if(camp[num-1]==true) {
			    	System.out.println("이미 예약된 캠프장 사용할수 없습니다");
			    }else {
			    	System.out.println("camp["+num+"] 캠프장 예약성공");
			    	camp[num-1]=true; 
			    }
			    
			    for(int i=0; i<camp.length; i++) {
					 if(camp[i]==true) {
					   System.out.println("  "+(i+1)+"번째 ■캠프사용중입니다 ");
					 }else {
					   System.out.println("  "+(i+1)+"번째 □캠프장은 비어 있습니다 "); 
					 }
				 } //for end
		     break;
		    	
		    case 2: //개인별처리
		    	System.out.print("퇴실캠핑번호 입력>>> ");
		    	num=Integer.parseInt(sc.nextLine());
				    if(camp[num-1]==true) {
				    	System.out.println("camp["+num+"] 캠프장 퇴실성공했습니다");
				    	camp[num-1]=false; 
				    }else {
				    	System.out.println("camp["+num+"] 비어있는 캠프장입니다");
				    }
				    
				    for(int i=0; i<camp.length; i++) {
						 if(camp[i]==true) {
						   System.out.println("  "+(i+1)+"번째 ■캠프사용중입니다 ");
						 }else {
						   System.out.println("  "+(i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
						 }
					 } //for end    
		        break;	
		    case 3: //전체예약상태
		    	 for(int i=0; i<camp.length; i++) {
		    		 if(camp[i]==true) {
		    		   System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
		    		 }else {
		    		   System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
		    		 }
		    	 } //for end
		    	break;
		    case 9: //종료
		    	System.out.println("캠프장예약프로그램을 종료합니다");
		    	break;
		    default: 
		    	System.out.println("1~3메뉴를 선택하셔야 합니다");
		    	break;	
		  }//switch end
		}catch (Exception e) {	}
		
		if(sel==9) { break;}
	}//while 
	
	sc.close();
	}//main end
}//TestCamping class END









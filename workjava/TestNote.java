package net.tis.day17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestNote  extends Frame implements ActionListener {    
	 //1단계 비주얼컴포넌트 객체 = 전역변수로 선언
	 Panel pan = new Panel() ;
	 Label info = new Label("입력: ");
	 TextField tf  = new TextField(30) ;  //한줄입력
	 Button btnsend = new Button(" 전송 ");
	 Button btnexit = new Button(" Exit ");
	 TextArea ta = new TextArea(); //여러라인입력
	 Font font = new Font("Comic Sans MS",Font.BOLD,36);
			 
	
	 public TestNote() {
		 //2단계 판넬에 info,tf,bs,be를 추가=add()
		 this.pan.add(info); //this생략가능
		 this.pan.add(tf);
		 this.pan.add(btnsend);
		 this.pan.add(btnexit);
		 
		 this.ta.setFont(new Font("Comic Sans MS",Font.BOLD,36)); //옵션
		 
		 //3단계 TestNote화면 동서남북중앙 add()
		 //this.add("East", new Label("동"));
		 //this.add("West", new Label("서"));
		 //this.add("South", new Label("남"));
		 //this.add("North", new Label("북 "));
		 this.add("Center",ta);
		 this.add("South", pan);

		 //4단계 큰화면 Frame의 위치 크기 제목 백칼라 보기
		 this.setTitle("초간단채팅");
		 this.setBackground(Color.YELLOW);
		  setBounds(600, 200, 400, 500);//필수항목
		  setVisible(true); //필수항목
		 
		 //5단계 리스너를 연결 ==> 리스너핸들러 ListenerHandler
		 //맨앞 this생략가능 ~~~~~~~리스너(this생략하면문법에러)
		 this.tf.addActionListener(this);
		 this.btnsend.addActionListener(this);
		 //this.btnexit.addActionListener(this);
		 //this.btnexit.addActionListener(ActionListener);
		 
		 
		 btnexit.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("06-18-목목목 프로그램을 종료합니다");
						System.exit(1);
	      	}
		 });
	 }//생성자 end
	
	 
	@Override
	public void actionPerformed(ActionEvent e) {
	 	Object ob=e.getSource();
		if(ob==this.tf) { 
			this.sendMessage();
		}else if(ob==this.btnsend) {
			this.sendMessage();
		}else if(ob==this.btnexit) {
			this.sendExit();
		}else{ }
	}//end
	
	public  void sendMessage() { //사용자가 새로 생성
		String data = this.tf.getText();
		this.ta.append(data +"\n");
		//this.ta.setText(data+"\n");
		this.tf.setText("");      //static없는곳에서 this사용가능
		this.tf.requestFocus();  //this생략가능 
	}//end
	
	public void sendExit( ) { //사용자가 새로 생성
		System.out.println("프로그램을 종료합니다");
		System.exit(1);
	}//end
		
	public static void main(String[] args) {
		TestNote tn = new TestNote(); 
		//메인메소드는 생성자만 인식 
	}//main end
	
}// TestNote class END









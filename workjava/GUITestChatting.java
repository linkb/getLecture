package net.tis.day17;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.midi.SysexMessage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUITestChatting  extends JFrame implements ActionListener{
    JPanel  firstPan, twoPan;
    JTextField tfip, tfnick, tfmessage;
    JTextArea ta;
    JButton btnConnect, btnSend, btnExit;
    BorderLayout bl;
    CardLayout cardlayout=new CardLayout(); 
    JLabel info;
    JPanel mainPan=new JPanel();
   
   public GUITestChatting() {
  	 this.setTitle("초간단채팅창");
  	 //JPanel mainPan, firstPan, twoPan; 필드전역변수껏 사용
  	 
  	 //첫번째 firstPan 먼저작성 ============================	 
  	 firstPan=new JPanel();
  	 
  	 JLabel jLb1=new JLabel("서버IP:");
  	 tfip=new JTextField("127.0.0.1", 20);
  	 JPanel pnA=new JPanel();
  	 pnA.add(jLb1); pnA.add(tfip);
  	 
  	 JLabel jLb2=new JLabel("대화명:");
  	 tfnick=new JTextField("LEE", 20);
  	 JPanel pnB=new JPanel();
  	 pnB.add(jLb2); pnB.add(tfnick);
  	 
  	 JLabel jLb3=new JLabel("IP와 대화명을 입력하세요");
  	 jLb3.setFont(new Font("굴림체", Font.BOLD, 20));
  	 jLb3.setForeground(Color.MAGENTA); //밝은보라색
  	 JPanel pnC=new JPanel();
  	 pnC.add(jLb3);
  	 
  	 btnConnect=new JButton("서버에접속Connection");
  	 
  	 JPanel pn=new JPanel();
  	 pn.add(pnA); pn.add(pnB); pn.add(pnC) ;
  	 
  	 //firstPan판넬에 pn, btnConnect붙어요
  	 firstPan.setBorder(BorderFactory.createTitledBorder("◆TestChatting채팅화면◆"));
  	 firstPan.setLayout(new BorderLayout());
  	 firstPan.add("Center", pn);
  	 firstPan.add("South", btnConnect);
  	 
  	 //this.add("Center", firstPan); 직접 firstPan대신 mainPan사용
  	 
  	 ////////////////////////////////////////////////
  	 //두번째 twoPan  두번째작성==========================
  	 twoPan=new JPanel();
  	 ta=new JTextArea();
  	 tfmessage=new JTextField(20);
  	 btnSend=new JButton("보내기");
  	 btnExit=new JButton("종 료");
  	 //JPanel pnX=new JPanel();
  	 //pnX.setBorder(BorderFactory.createTitledBorder("♣채팅내용♣"));
  	 
  	 JPanel pnY=new JPanel();
  	 pnY.setBorder(BorderFactory.createTitledBorder("☆대화하기☆"));
  	 pnY.add(tfmessage); pnY.add(btnSend);  pnY.add(btnExit);
  	 
  	 twoPan.setBorder(BorderFactory.createTitledBorder("♣채팅내용♣"));
  	 twoPan.setLayout(new BorderLayout()); //판넬의 기본레이아웃  왼쪽에서 오른쪽
  	 twoPan.add("Center", ta);
  	 twoPan.add("South", pnY);
  	 
  	 //3번째 mainPan=firstPan+twoPan
   	 mainPan.setLayout(cardlayout); //판넬,J판넬 기본 FlowLayout
  	 mainPan.add(firstPan, "접속창");
  	 mainPan.add(twoPan, "채팅창");
  	 cardlayout.show(mainPan, "접속창");
  	 this.add(mainPan);  //JFrame에 add하믄 중앙에 붙이기
  	 
  	 this.setBounds(300,300, 450, 300); //필수항목
  	 this.setVisible(true); //필수항목
 
  	 //윈도우종료
 		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		 //이벤트핸들러 리스너 등록 컴포넌트.addXXX리스너(this);
  		btnConnect.addActionListener(this);
  		
  		btnExit.addActionListener(this);
  		btnSend.addActionListener(this);
  		tfmessage.addActionListener(this);
   }//생성자 end

	public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==btnConnect) {
    	cardlayout.show(mainPan, "채팅창"); //카드레이아웃에 2번째판넬보여줌
    	System.out.println("btnConnect");
    }else if(ae.getSource()==btnSend) {
    	ta.append(tfmessage.getText()+"\n");
    	tfmessage.setText("");
    	tfmessage.requestFocus();
    }else if(ae.getSource()==btnExit) {
    	System.out.println("채팅client접속화면프로그램을 종료합니다");
    	System.exit(1);
    }else if(ae.getSource()==tfmessage) {//메세지입력한후 enter
    	ta.append(tfmessage.getText()+"\n");
    	tfmessage.setText("");
    	tfmessage.requestFocus();
    }
	}//actionPerformed end
	
	 public static void main(String[] args) {
		 new GUITestChatting();
	 }//main end
}//class END

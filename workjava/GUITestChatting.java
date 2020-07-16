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
  	 this.setTitle("�ʰ���ä��â");
  	 //JPanel mainPan, firstPan, twoPan; �ʵ����������� ���
  	 
  	 //ù��° firstPan �����ۼ� ============================	 
  	 firstPan=new JPanel();
  	 
  	 JLabel jLb1=new JLabel("����IP:");
  	 tfip=new JTextField("127.0.0.1", 20);
  	 JPanel pnA=new JPanel();
  	 pnA.add(jLb1); pnA.add(tfip);
  	 
  	 JLabel jLb2=new JLabel("��ȭ��:");
  	 tfnick=new JTextField("LEE", 20);
  	 JPanel pnB=new JPanel();
  	 pnB.add(jLb2); pnB.add(tfnick);
  	 
  	 JLabel jLb3=new JLabel("IP�� ��ȭ���� �Է��ϼ���");
  	 jLb3.setFont(new Font("����ü", Font.BOLD, 20));
  	 jLb3.setForeground(Color.MAGENTA); //���������
  	 JPanel pnC=new JPanel();
  	 pnC.add(jLb3);
  	 
  	 btnConnect=new JButton("����������Connection");
  	 
  	 JPanel pn=new JPanel();
  	 pn.add(pnA); pn.add(pnB); pn.add(pnC) ;
  	 
  	 //firstPan�ǳڿ� pn, btnConnect�پ��
  	 firstPan.setBorder(BorderFactory.createTitledBorder("��TestChattingä��ȭ���"));
  	 firstPan.setLayout(new BorderLayout());
  	 firstPan.add("Center", pn);
  	 firstPan.add("South", btnConnect);
  	 
  	 //this.add("Center", firstPan); ���� firstPan��� mainPan���
  	 
  	 ////////////////////////////////////////////////
  	 //�ι�° twoPan  �ι�°�ۼ�==========================
  	 twoPan=new JPanel();
  	 ta=new JTextArea();
  	 tfmessage=new JTextField(20);
  	 btnSend=new JButton("������");
  	 btnExit=new JButton("�� ��");
  	 //JPanel pnX=new JPanel();
  	 //pnX.setBorder(BorderFactory.createTitledBorder("��ä�ó����"));
  	 
  	 JPanel pnY=new JPanel();
  	 pnY.setBorder(BorderFactory.createTitledBorder("�ٴ�ȭ�ϱ��"));
  	 pnY.add(tfmessage); pnY.add(btnSend);  pnY.add(btnExit);
  	 
  	 twoPan.setBorder(BorderFactory.createTitledBorder("��ä�ó����"));
  	 twoPan.setLayout(new BorderLayout()); //�ǳ��� �⺻���̾ƿ�  ���ʿ��� ������
  	 twoPan.add("Center", ta);
  	 twoPan.add("South", pnY);
  	 
  	 //3��° mainPan=firstPan+twoPan
   	 mainPan.setLayout(cardlayout); //�ǳ�,J�ǳ� �⺻ FlowLayout
  	 mainPan.add(firstPan, "����â");
  	 mainPan.add(twoPan, "ä��â");
  	 cardlayout.show(mainPan, "����â");
  	 this.add(mainPan);  //JFrame�� add�Ϲ� �߾ӿ� ���̱�
  	 
  	 this.setBounds(300,300, 450, 300); //�ʼ��׸�
  	 this.setVisible(true); //�ʼ��׸�
 
  	 //����������
 		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		 //�̺�Ʈ�ڵ鷯 ������ ��� ������Ʈ.addXXX������(this);
  		btnConnect.addActionListener(this);
  		
  		btnExit.addActionListener(this);
  		btnSend.addActionListener(this);
  		tfmessage.addActionListener(this);
   }//������ end

	public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==btnConnect) {
    	cardlayout.show(mainPan, "ä��â"); //ī�巹�̾ƿ��� 2��°�ǳں�����
    	System.out.println("btnConnect");
    }else if(ae.getSource()==btnSend) {
    	ta.append(tfmessage.getText()+"\n");
    	tfmessage.setText("");
    	tfmessage.requestFocus();
    }else if(ae.getSource()==btnExit) {
    	System.out.println("ä��client����ȭ�����α׷��� �����մϴ�");
    	System.exit(1);
    }else if(ae.getSource()==tfmessage) {//�޼����Է����� enter
    	ta.append(tfmessage.getText()+"\n");
    	tfmessage.setText("");
    	tfmessage.requestFocus();
    }
	}//actionPerformed end
	
	 public static void main(String[] args) {
		 new GUITestChatting();
	 }//main end
}//class END

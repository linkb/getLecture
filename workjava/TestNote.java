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
	 //1�ܰ� ���־�������Ʈ ��ü = ���������� ����
	 Panel pan = new Panel() ;
	 Label info = new Label("�Է�: ");
	 TextField tf  = new TextField(30) ;  //�����Է�
	 Button btnsend = new Button(" ���� ");
	 Button btnexit = new Button(" Exit ");
	 TextArea ta = new TextArea(); //���������Է�
	 Font font = new Font("Comic Sans MS",Font.BOLD,36);
			 
	
	 public TestNote() {
		 //2�ܰ� �ǳڿ� info,tf,bs,be�� �߰�=add()
		 this.pan.add(info); //this��������
		 this.pan.add(tf);
		 this.pan.add(btnsend);
		 this.pan.add(btnexit);
		 
		 this.ta.setFont(new Font("Comic Sans MS",Font.BOLD,36)); //�ɼ�
		 
		 //3�ܰ� TestNoteȭ�� ���������߾� add()
		 //this.add("East", new Label("��"));
		 //this.add("West", new Label("��"));
		 //this.add("South", new Label("��"));
		 //this.add("North", new Label("�� "));
		 this.add("Center",ta);
		 this.add("South", pan);

		 //4�ܰ� ūȭ�� Frame�� ��ġ ũ�� ���� ��Į�� ����
		 this.setTitle("�ʰ���ä��");
		 this.setBackground(Color.YELLOW);
		  setBounds(600, 200, 400, 500);//�ʼ��׸�
		  setVisible(true); //�ʼ��׸�
		 
		 //5�ܰ� �����ʸ� ���� ==> �������ڵ鷯 ListenerHandler
		 //�Ǿ� this�������� ~~~~~~~������(this�����ϸ鹮������)
		 this.tf.addActionListener(this);
		 this.btnsend.addActionListener(this);
		 //this.btnexit.addActionListener(this);
		 //this.btnexit.addActionListener(ActionListener);
		 
		 
		 btnexit.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("06-18-���� ���α׷��� �����մϴ�");
						System.exit(1);
	      	}
		 });
	 }//������ end
	
	 
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
	
	public  void sendMessage() { //����ڰ� ���� ����
		String data = this.tf.getText();
		this.ta.append(data +"\n");
		//this.ta.setText(data+"\n");
		this.tf.setText("");      //static���°����� this��밡��
		this.tf.requestFocus();  //this�������� 
	}//end
	
	public void sendExit( ) { //����ڰ� ���� ����
		System.out.println("���α׷��� �����մϴ�");
		System.exit(1);
	}//end
		
	public static void main(String[] args) {
		TestNote tn = new TestNote(); 
		//���θ޼ҵ�� �����ڸ� �ν� 
	}//main end
	
}// TestNote class END









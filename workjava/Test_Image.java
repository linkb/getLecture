package net.tis.day17;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.util.Observer;

import javax.swing.JFrame;

public class Test_Image extends JFrame  implements KeyListener {    
	Image img; //�ʵ�
	int img_x=50, img_y=250 ; //�ʵ�
	
	public Test_Image() { 	
		Toolkit tk=Toolkit.getDefaultToolkit();
		img=tk.getImage("C:\\Mtest\\manju1.gif");
		//�����ڿ��� �׸������� paint( )�׸��ε�
		
		Container ct=this.getContentPane();
		this.setTitle("�׸��̵�����");
		ct.setBackground(Color.GREEN);
		//ct.setBackground(Color.YELLOW);
		this.setBounds(200, 200, 600,550);
		this.setVisible(true);//�����������¿���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â�ݱ�
		
		//��key������ȣ��=�̺�Ʈ�ڵ鷯
		addKeyListener(this);
	}//�⺻������ �ڵ���
	
	public void paint(Graphics g) {
		super.paint(g); //�θ� �޼ҵ� ȣ���ʼ�
		g.drawImage(img, img_x, img_y,this);
	}//paint end
	
	public void keyReleased(KeyEvent e) {  }//end
	public void keyTyped(KeyEvent e){ }//end
	
	public void keyPressed(KeyEvent e) {
		int code=e.getKeyCode();
		if(code==KeyEvent.VK_RIGHT){ 
			 img_x=img_x+20; 
			 if(img_x>=580) {img_x=-20;}
		}else if(code==KeyEvent.VK_LEFT){
			 img_x=img_x-20;
			 if(img_x<-30){ img_x=590;}
		}else if(code==KeyEvent.VK_UP) {
			img_y=img_y-20;
			if(img_y<-30){ img_y=530;}
		}else if(code==KeyEvent.VK_DOWN) {
			img_y=img_y+20;
			if(img_y>540){ img_y=-25;}
		}else if(code==KeyEvent.VK_ESCAPE) {
			 System.out.println("�׸��̵������� �����մϴ�");
			 System.exit(1);
		}else{ } 
			 
		repaint();//paint�޼ҵ�ȣ��
	}//end

	public static void main(String[] args){
		Test_Image nt =new Test_Image( );
	}//main end
	
}//class END




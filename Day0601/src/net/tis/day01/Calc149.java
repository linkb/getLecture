package net.tis.day01;

public class Calc149 {
	public static void main(String[] args) {
		//double avg = 45.6;
		//String data ="1200";
		
		String cook=args[0];
		String price=args[1];
		int total = Integer.parseInt(price) * 3; 
		
		System.out.println(cook +"���� �丮�� ���İ����� " + price +"���Դϴ�");
		System.out.println(cook +"���� �丮�� ���İ����� " + total +"���Դϴ�");
		//�丮���� 2400��� * 3
		//����>>> �����
		//����>>> 2400 
		//��������  �丮�� ���İ����� 7200���Դϴ�
	}//main end
}// class END


/*
package net.tis.day01;

public class Calc149 {
	public static void main(String[] args) {
		double avg = 45.6;
		String data ="1200";
		
		int a = (int)avg ;    //int=4Byte=������
		int b = Integer.parseInt(data) ;   //int=4Byte=������
		//int c = (int)data; �����ǿ���
		
		System.out.println(data+679);
		System.out.println(b+679);
		//System.out.println("1200"+679);
		//System.out.println(1200+679);
				
		//�丮���� 2400��� * 3
		//����>>> �����
		//����>>> 2400 
		
		//�������� �丮�� ������ 7200���Դϴ�
	}//main end
}// class END 
*/
package net.tis.day01;


public class Test1 {
	
	public static void main(String[] args) {	
		 String name[][] = new String[3][5];	//������ȣ
		 String title="�δ��佺Ʈ";
		 name[0][1]="aaa";
		 name[1][4]="bbb";
		 name[2][2]="ccc";
		 
			System.out.println("\n\t[ "+ title +" ���� ���� ]");
			for(int i = 0; i < 3; i++){
					for(int b = 0; b < 5; b++){
					   System.out.print((i+1)+"0"+(b+1)+"\t");
					}
					
					System.out.println(); //�̸�ǥ�� ������Դϴ�
					
					for(int j = 0; j < 5; j++){
						if(name[i][j] == null){
							System.out.print("\t");
						}//if end
						else {System.out.print(name[i][j]+"\t"); }   
					}//j end
					System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�"); //n�ʿ� 
			}//for i end
	}//main end
	
	
	
}// class END

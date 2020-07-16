package net.tis.day01;

public class Calc149 {
	public static void main(String[] args) {
		//double avg = 45.6;
		//String data ="1200";
		
		String cook=args[0];
		String price=args[1];
		int total = Integer.parseInt(price) * 3; 
		
		System.out.println(cook +"님이 요리한 음식가격은 " + price +"원입니다");
		System.out.println(cook +"님이 요리한 음식가격은 " + total +"원입니다");
		//요리가격 2400재료 * 3
		//세프>>> 백사장
		//가격>>> 2400 
		//백사장님이  요리한 음식가격은 7200원입니다
	}//main end
}// class END


/*
package net.tis.day01;

public class Calc149 {
	public static void main(String[] args) {
		double avg = 45.6;
		String data ="1200";
		
		int a = (int)avg ;    //int=4Byte=정수형
		int b = Integer.parseInt(data) ;   //int=4Byte=정수형
		//int c = (int)data; 문법의에러
		
		System.out.println(data+679);
		System.out.println(b+679);
		//System.out.println("1200"+679);
		//System.out.println(1200+679);
				
		//요리가격 2400재료 * 3
		//세프>>> 백사장
		//가격>>> 2400 
		
		//백사장님이 요리한 음식은 7200원입니다
	}//main end
}// class END 
*/
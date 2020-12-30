package Chap1;

public class StringEquals {

	public static void main(String[] args) {
		String strVar1 = "신민철"; // 
		String strVar2 = "신민철"; // strVar1 값과 같으므로 같은 번지에 생성된다(주소값 같음)
		String strVar3 = new String("신민철"); // 생성자를 이용한 객체 생성 (값이 같더라도 새로 만든거기때문에 다른번지에 생성된다)(주소값 다름)
		String strVar4 = new String("신민철");
		
		System.out.println( strVar1 == strVar2); //번지수를 비교
		System.out.println( strVar1 == strVar3);
		System.out.println( strVar3 == strVar4);
		System.out.println();
		System.out.println( strVar1.equals(strVar2)); //안에 들어있는 실제값을 비교
		System.out.println( strVar1.equals(strVar3));
		System.out.println( strVar3.equals(strVar4));

	}

}

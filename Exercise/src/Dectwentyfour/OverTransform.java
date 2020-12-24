package Dectwentyfour;

public class OverTransform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드= " + intValue2);
		System.out.println("출력문자= " + (char)intValue2);
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		double doubleValue = intValue5/4.0;
		System.out.println(doubleValue);	
		
	}

}

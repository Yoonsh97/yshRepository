package Chap1;

public class StringConcat {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //문자열이므로 그대로 이어붙이기
		String str4 = 3 + 3.0 + "JDK";//정수먼저 합더한후 문자열로 이어붙이기
		System.out.println(str3);
		System.out.println(str4);
	}

}

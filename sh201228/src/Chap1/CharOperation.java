package Chap1;

public class CharOperation {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A' ;
		//char c3 = c2 + 1;	컴파일오류	=> c2는 변수이기때문에 더할수없다
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);

	}

}

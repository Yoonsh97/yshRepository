package Chap1;

public class ConditionalOperation {

	public static void main(String[] args) {
		int score = 100;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은" + " "  + grade + "학점입니다.");
// 삼항연산식 : 조건문이 맞으면 앞에있는 값 다르면 뒤에있는 값
	}

}

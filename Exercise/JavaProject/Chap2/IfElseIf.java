package Chap2;

public class IfElseIf {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 90~100입니다.");
			System.out.println("학점은 A입니다.");
		} else if(score>=80)	{
			System.out.println("점수가 80~89입니다.");
			System.out.println("학점은 B입니다");
		} else if(score>=70)	{
			System.out.println("점수가 70~79입니다.");
			System.out.println("학점은 C입니다");
		} else if(score>=60)	{
			System.out.println("점수가 60~69입니다.");
			System.out.println("학점은 D입니다");
		}	else if(score<60)	{		// = else { System.out.println("학점은 F입니다.")
				System.out.println("점수가 60미만 입니다.");
				System.out.println("학점은 F입니다");
		}
	}
}


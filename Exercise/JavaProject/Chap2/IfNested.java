package Chap2;

public class IfNested {

	public static void main(String[] args) {
		int score =  (int)(Math.random()*20) +81; //		0 <= Math.random() < 1 사이의 값을 얻어낼수있다
		System.out.println("점수:" + score);
		
		String grade;
		
		if(score >= 90) {
			if(score >= 95) {
					grade = "A+";
				} else {
					grade = "A";
			}			
		} else  if(score >= 80) {
			if(score >= 85)	{
					grade = "B+";
				} else {
					grade = "B";
			}
		} else if(score >= 70) {
			if(score >= 75) {
					grade = "C+";
				} else {
					grade = "C";
			}		
		} else if(score >= 60) {
			if(score >= 65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}
		
			System.out.println("학점: " + grade);
		}
}






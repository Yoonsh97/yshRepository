package Chap2;

public class IfElseIf {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("������ 90~100�Դϴ�.");
			System.out.println("������ A�Դϴ�.");
		} else if(score>=80)	{
			System.out.println("������ 80~89�Դϴ�.");
			System.out.println("������ B�Դϴ�");
		} else if(score>=70)	{
			System.out.println("������ 70~79�Դϴ�.");
			System.out.println("������ C�Դϴ�");
		} else if(score>=60)	{
			System.out.println("������ 60~69�Դϴ�.");
			System.out.println("������ D�Դϴ�");
		}	else if(score<60)	{		// = else { System.out.println("������ F�Դϴ�.")
				System.out.println("������ 60�̸� �Դϴ�.");
				System.out.println("������ F�Դϴ�");
		}
	}
}


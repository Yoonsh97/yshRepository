package Chap3;

public class ArrayCreateByValueList {
	public static void main(String[] args) {
			int[] score = { 91, 99, 93 };
			
			System.out.println("������ : " + score[0]);
			System.out.println("��γ� : " + score[1]);
			System.out.println("�ּ��� : " + score[2]);
	
			int sum = 0;
			for(int i=0; i<3; i++) {
				sum += score[i];
			}
			
			System.out.println("����: " + sum);
			double avg = (double) sum / 3;
			System.out.println("���: " + avg);
	}
}

package sh201230_1;

public class Array {

	public static void main(String[] args) {
		int[] score = { 79, 99, 91, 33, 100, 55, 95};
		
		int max = score[0]; //�迭�� ù��° ������ �ִ밪�� �ʱ�ȭ �Ѵ�.
		int min = score[0]; //�迭�� ù��° ���� �ּҰ����� �ʱ�ȭ �Ѵ�.
		
		for(int i =0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ִ밪: " +  max);
		System.out.println("�ּҰ�: " +  min);
		
	}
}

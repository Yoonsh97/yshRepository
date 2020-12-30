package sh201230_1;

public class Array {

	public static void main(String[] args) {
		int[] score = { 79, 99, 91, 33, 100, 55, 95};
		
		int max = score[0]; //배열의 첫번째 값으로 최대값을 초기화 한다.
		int min = score[0]; //배열의 첫번째 값을 최소값으로 초기화 한다.
		
		for(int i =0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최대값: " +  max);
		System.out.println("최소값: " +  min);
		
	}
}

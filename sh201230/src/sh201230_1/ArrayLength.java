package sh201230_1;

public class ArrayLength {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 }; //3
		
		int sum= 0;
		for(int i=0; i<scores.length; i++) { //i < 3; 
				sum += scores[i];
		}
		System.out.println("����: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���: " + avg);
	}
}

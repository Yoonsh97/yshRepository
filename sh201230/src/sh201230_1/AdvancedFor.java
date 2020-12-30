package sh201230_1;

public class AdvancedFor {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		for (int score : scores) { //for(int i =0; i < scores.length; i ++)
			sum = sum + score;
		}

		double avg = (double) sum / scores.length;
		System.out.println("ЦђБе: " + avg);
	}
}

package Chap3;

public class ArrayInArray {
		public static void main(String[] args) {
			int[][] mathScores = new int[2][3];
			//int[][] mathScores = {{100, 98,89},{87, 80, 90}};
			for(int i =0; i<mathScores.length; i++) { //�� �ε���
				for(int k = 0; k<mathScores[i].length; k++) { // �� �ε���
						System.out.println("mathScores["+i+"]["+k+"]=" +mathScores[i][k]);
				}
			}
			System.out.println();
			
			int[][] englishScores = new int[2][]; //���� 2���� �迭
			englishScores[0] = new int[2];
			englishScores[1] = new int[3];
			for(int i =0; i<englishScores.length; i++) { //2 (��)
				for(int k = 0; k<englishScores[i].length; k++) { // ��
					System.out.println("englishScores["+i+"]["+k+"]=" +englishScores[i][k]);
				}
			}
			System.out.println();

			int[][] javaScores = { {95, 80}, {92, 96, 80} };
			for(int i =0; i<javaScores.length; i++) { //2 ��
				for(int k = 0; k<javaScores[i].length; k++) { //��
					System.out.println("javaScores["+i+"]["+k+"]=" +javaScores[i][k]);
			}
		}
	}
}
package Chap2;
import java.util.Scanner;

public class DoWhile {
		public static void main(String[] args) {
			System.out.println("�޼����� �Է��ϼ���");
			System.out.println("���α׷��� �����Ϸ��� quit�� �Է��ϼ���");
			
			Scanner scanner = new Scanner(System.in);
			String inputString;
			
			do {
					System.out.print(">");
					inputString = scanner.nextLine();
					System.out.println(inputString);
			}	while( ! inputString.equals("quit"));
			
			System.out.println();
			System.out.print("���α׷� ����");
	}
}

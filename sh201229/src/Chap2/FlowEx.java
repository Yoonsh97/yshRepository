package Chap2;

import java.util.Scanner;

public class FlowEx {
		public static void main(String[] args) {
			int menu = 0;
		
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
					System.out.println("(1) square"); //������� 1���� ���� �Ǵ� ����
					System.out.println("(2) square root"); // 2���� ��ü
					System.out.println("(3) log"); // �н� �� ���� �Ű�
					System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>  ");
					
					String tmp = scanner.nextLine(); //ȭ�鿡�� �Է¹��� ������ tmp�� �����Ѵ�
					menu = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
					
					if(menu==0) {
							System.out.println("���α׷��� �����մϴ�.");
							break;
					} else if (!(1 <= menu && menu <=3)) { //1���� 3�������� ���ڰ� �ƴ� ���
							System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
							continue;
					}
					
					System.out.println("�����Ͻ� �޴��� " +  menu + "���Դϴ�.");
			}
	}

}

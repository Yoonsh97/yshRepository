package Chap2;

import java.util.Scanner;

public class Calculator_selfmade {
		public static void main(String[] args) {
		int menu = 0;
		int m =0 ;
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
				System.out.println("(1)����");
				System.out.println("(2)����");
				System.out.println("(3)����");
				System.out.println("(4)������");
				System.out.println("���ϴ� �޴�(1~4)�� �����ϼ���.(����:0)>  ");
				
				menu=scanner.nextInt();
				
				if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
			} else {
				
				System.out.println("ù��° ����: ");
				m = scanner.nextInt();
				System.out.println("�ι�° ����: ");
				n = scanner.nextInt();
					
				switch(menu) {
					
					case 1:
							System.out.println(m+"+"+n+"= "+(m+n));
							break;
					case 2:
							System.out.println(m+"-"+n+"= "+(m-n));
							break;
					case 3:
							System.out.println(m+"*"+n+"= "+(m*n));
							break;
					case 4:
							System.out.println(m+"%"+n+"= "+(m%n));
							break;
				}
		}
	}
}
}

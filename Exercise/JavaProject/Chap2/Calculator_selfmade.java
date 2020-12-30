package Chap2;

import java.util.Scanner;

public class Calculator_selfmade {
		public static void main(String[] args) {
		int menu = 0;
		int m =0 ;
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
				System.out.println("(1)덧셈");
				System.out.println("(2)뺄셈");
				System.out.println("(3)곱셈");
				System.out.println("(4)나눗셈");
				System.out.println("원하는 메뉴(1~4)를 선택하세요.(종료:0)>  ");
				
				menu=scanner.nextInt();
				
				if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else {
				
				System.out.println("첫번째 숫자: ");
				m = scanner.nextInt();
				System.out.println("두번째 숫자: ");
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

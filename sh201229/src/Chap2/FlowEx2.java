package Chap2;

import java.util.Scanner;

public class FlowEx2 {			//	menu-driven 방식이라고 한다
		public static void main(String[] args) {
			int menu = 0;
			int num = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			outer :
			while(true) {
					System.out.println("(1) square"); //예를들면 1번은 예금 또는 적금
					System.out.println("(2) square root"); // 2번은 이체
					System.out.println("(3) log"); // 분실 및 도난 신고
					System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>  ");
					
					String tmp = scanner.nextLine(); //화면에서 입력받은 내용을 tmp에 저장한다
					menu = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
					
					if(menu==0) {
							System.out.println("프로그램을 종료합니다.");
							break;
					} else if (!(1 <= menu && menu <=3)) { //1번과 3번사이의 숫자가 아닐 경우
							System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
							continue;
					}
					
					for(;;) {
							System.out.println("계산할 값을 입력하세요.(계산종료:0, 전체종료:99)>");
							tmp = scanner.nextLine();
							num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
							
							if(num==0)
									break;					// 계산종료. for문을 벗어난다
							if(num==99)
									break outer; 		// 전체종료. for문과 while문을 모두 벗어난다.
							
							switch(menu) {
									case 1:
											System.out.println("result="+ num*num);
											break;
									case 2:
										System.out.println("result="+ Math.sqrt(num));
										break;
									case 3:
										System.out.println("result="+ Math.log(num));
										break;
							}
					}
					// System.out.println("선택하신 메뉴는 " +  menu + "번입니다.");
			}
	}
}

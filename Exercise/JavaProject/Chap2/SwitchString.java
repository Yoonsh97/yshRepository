package Chap2;

public class SwitchString {

	public static void main(String[] args) {
			String position = "사원";
			
			switch(position) {
					case "부장" :
							System.out.println("월급은 700만원입니다.");
							break;
					case "과장" :
							System.out.println("월급은 500만원입니다.");
							break;
					default :
							System.out.println("월급은 300만원입니다.");
							break;
			}
	}
}

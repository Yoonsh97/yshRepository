package sh201230_1;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch(week) {
				case 1 :
					today = Week.MONDAY; break;
				case 2 :
					today = Week.TUESDAY; break;
				case 3 :
					today = Week.WEDNESDAY; break;
				case 4 :
					today = Week.THURSDAY; break;
				case 5 :
					today = Week.FRIDAY; break;
				case 6 :
					today = Week.SATURDAY; break;
				case 7 :
					today = Week.SUNDAY; break;
					
											
		}

		System.out.println("���ÿ��� : " + today);
		
		if(today == Week.SUNDAY) {
				System.out.println("�Ͽ����� �౸�ϴ� ��");
		} else {
				System.out.println("�ڹ� ��������");		
		}
	}
}
package Chap1;

public class StringEquals {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö"; // 
		String strVar2 = "�Ź�ö"; // strVar1 ���� �����Ƿ� ���� ������ �����ȴ�(�ּҰ� ����)
		String strVar3 = new String("�Ź�ö"); // �����ڸ� �̿��� ��ü ���� (���� ������ ���� ����ű⶧���� �ٸ������� �����ȴ�)(�ּҰ� �ٸ�)
		String strVar4 = new String("�Ź�ö");
		
		System.out.println( strVar1 == strVar2); //�������� ��
		System.out.println( strVar1 == strVar3);
		System.out.println( strVar3 == strVar4);
		System.out.println();
		System.out.println( strVar1.equals(strVar2)); //�ȿ� ����ִ� �������� ��
		System.out.println( strVar1.equals(strVar3));
		System.out.println( strVar3.equals(strVar4));

	}

}

package Chap1;

public class VariableOperation {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;		//11
		++x;		//12
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		y--;		//9
		--y;		//8
		System.out.println("y=" +y);
		
		System.out.println("------------------");
		z = x++;		//z�� x�� �����ѵڿ� x�� ������Ų��
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		z = ++x;		//x���� ������Ű�� z�� ����
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		z = ++x + y++;	//x���� ������Ű�� y���� �����ѵڿ� z�� ���� ���ϰ� �״����� y���� ������Ų��
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" +y);
		System.out.println("------------------");
		
	}

}

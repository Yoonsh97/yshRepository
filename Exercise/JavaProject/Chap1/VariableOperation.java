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
		z = x++;		//z에 x를 대입한뒤에 x를 증가시킨다
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		z = ++x;		//x값을 증가시키고 z에 대입
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		z = ++x + y++;	//x값을 증가시키고 y값을 대입한뒤에 z의 값을 구하고 그다음에 y값을 증가시킨다
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" +y);
		System.out.println("------------------");
		
	}

}

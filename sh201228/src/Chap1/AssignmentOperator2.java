package Chap1;

public class AssignmentOperator2 {
	public static void main(String[] args) {
	int result = 10;
	
	result &= 3;
	System.out.println("result=" + result);
	result |= 3;
	System.out.println("result=" + result);
	result ^= 3;
	System.out.println("result=" + result);
	
	result <<= 3;
	System.out.println("result=" + result);
	result >>= 3;
	System.out.println("result=" + result);
	result >>>= 3;
	System.out.println("result=" + result);
	}
}

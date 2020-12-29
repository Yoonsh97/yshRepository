package Chap1;

public class BitShift {

	public static void main(String[] args) {
		System.out.println("1 << 3 = " + (1<<3)); // 0000 0001 => 0000 1000 
		System.out.println("-8 >> 3 = " + (-8>>3));
		System.out.println("-8 >>> 3 = " + (-8>>>3));
		
		System.out.println(toBinaryString(1));
		System.out.println("<< 3 ");
		System.out.println(toBinaryString(1<<3));
	}
		
		static String toBinaryString(int value) {
			String str = Integer.toBinaryString(value);
			while(str.length() < 32) {
				str = "0" + str;
			}
			return str;
	}

}

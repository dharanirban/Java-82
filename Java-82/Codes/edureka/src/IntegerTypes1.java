
public class IntegerTypes1 {

	public static void main(String[] args) {
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		byte b = 127;
		System.out.println(b);
		
		//int n = 2147483648; //The literal 2147483648 of type int is out of range
		long pop = 2147483648L;
		
		System.out.println("World Population = " + pop);
		
		int n = (int)12L;
		System.out.println(n);
		
		byte x = (byte)129;
		System.out.println(x);
	}

}

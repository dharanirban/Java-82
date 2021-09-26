
public class IncrementOperator {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(n++); //post increment   10
		System.out.println(++n); //pre increment    12
		
		int x = 10;
		int y = 5;
		System.out.println(++x * y--);
		System.out.println(x);
		System.out.println(y);
	}
}

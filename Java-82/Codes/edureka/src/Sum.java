import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first number: ");
		int x = sc.nextInt();
		
		System.out.print("enter second number: ");
		int y = sc.nextInt();
		
		int z = x + y;
		
		System.out.println();
		
		System.out.println("Sum = " + z);
		System.out.println(x + " + " + y + " = " + z);
		
		sc.close();
	}

}

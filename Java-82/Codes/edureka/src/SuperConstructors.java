class A2{
	A2(int n){
		System.out.println("--- inside A2 constructor ---");
	}
}

class B2 extends A2{
	B2(){
		super(12);
		System.out.println("--- inside B2 constructor ---");
	}	
}

public class SuperConstructors {
	public static void main(String[] args) {
		B2 obj = new B2();
	}
}

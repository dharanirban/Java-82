
public class StringCreations {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		System.out.println(s1 == s2); //true
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3 == s4); //false	
		
		s1.concat(" bangalore");
		//s1 = s1.concat(" bangalore");
		System.out.println(s1);
		
		String s5 = new String();
		s5="Edureka";
		String s6 = new String();
		s6="Edureka";
		System.out.println(s5 == s6);
		
	}
}

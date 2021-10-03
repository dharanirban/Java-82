
public class StringMethods {

	public static void main(String[] args) {
		String s1 = new String("Java"); 
		//String s2 = new String("Java");
		String s2 = new String("java");
		System.out.println(s1 == s2); //false
		
		System.out.println("equals() ---> " + s1.equals(s2));
		System.out.println("contentEquals() ---> " + s1.contentEquals(s2));
		System.out.println("equalsIgnoreCase() ---> " + s1.equalsIgnoreCase(s2));
		System.out.println("==========================================================");
		
		String str = "edureka limited";
		System.out.println("Size of \""+str+"\" = " + str.length());
		System.out.println("----------------------------------------------------------");
		
		System.out.println("character @ index 0 = " + str.charAt(0));
		System.out.println("----------------------------------------------------------");
		
		System.out.println("index of \"e\" = "+ str.indexOf("e"));
		System.out.println("last index of \"e\" = "+ str.lastIndexOf("e"));
		System.out.println("index of \"zee\" = "+ str.indexOf("zee")); //-1
		System.out.println("----------------------------------------------------------");
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());		
		System.out.println("----------------------------------------------------------");
		System.out.println(str.replace('e', '*'));
		System.out.println(str);
		System.out.println("index of \"e\" = "+ str.indexOf("e",str.indexOf("e")+1));
		System.out.println("----------------------------------------------------------");
		
		String s3 = new String("edureka");
		String s4 = "edureka";
		String s5 = s3.intern();
		System.out.println(s4 == s5);
				
	}

}

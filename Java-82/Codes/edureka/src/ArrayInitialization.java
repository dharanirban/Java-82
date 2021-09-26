
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {98,86,74,63,90,82};
		
		System.out.println("No of Subjects = " + marks.length);
		System.out.println();
		
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for Subject-"+(i+1) + " = " + marks[i]);
		}
		System.out.println();
		
		/*--- array iteration using enhanced for loop ---*/
		System.out.print("Marks Obtained ---> ");
		for(int mark : marks) {
			System.out.print(mark+"    ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}

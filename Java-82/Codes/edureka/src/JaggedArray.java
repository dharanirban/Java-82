
public class JaggedArray {

	public static void main(String[] args) {
		int[][] n = new int[4][];
		
		n[0] = new int[4];
		n[1] = new int[6];
		n[2] = new int[2];
		n[3] = new int[8];

		System.out.println("Size of Array = " + n.length);
		
		for(int i=0; i<n.length;i++) {
			System.out.println("Size of n["+i+"] = " + n[i].length);
		}
		System.out.println();
		
		/*--- to display elements of array in matrix form ---*/
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j]+"    ");
			}
			System.out.println();
		}		
		
	}

}

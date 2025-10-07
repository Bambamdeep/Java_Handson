package arrayDemo;

public class Array {

	public static void main(String[] args) {
		/*
		 * // 1D Array int [] array = {1,2};
		 * 
		 * int [] arr = new int[5]; // big bracket define the size of array. arr[0] = 1;
		 * // insterting value to the Array; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4]
		 * = 5; // no value assign to array it will print null;
		 * 
		 * System.out.println(arr[0]); // printing single Array value.
		 * System.out.println("\n"); //Transversing the Array. for(int i =0 ;
		 * i<arr.length;i++) { System.out.println(arr[i]); }
		 */
		// 2D Arrays; //{{},{}}

		int[][] marks = { { 10, 20, 30 }, { 40, 50, 60 } };

		System.out.println("Marks of Student");

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Student " + (i + 1) + ":");
			for (int j = 0; j < marks[i].length; j++) {
			//	System.out.println("Subject " + j + 1 +":");
			  System.out.println(marks[i][j] + " ");
			}
			//System.out.println();
		}
          System.out.println("\n");
		int [][] matrix = new int [2][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][1] = 3;
	//	matrix[2][2] = 4;
		for (int i = 0 ; i< matrix.length;i++) {
			for(int j =0 ;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}

package reviewingJavaProgramming;

public class question1 {
	public static void main(String args[]){
		int rows = 5;
		int columns = 5;

		int[][] twoD_arr = new int[rows][columns];

		int value = 1;
		for (int i=0; i < rows; i++){
			for (int j=0; j < columns; j++){
				twoD_arr[i][j] = value;
				value++;
			}
		}

		for (int i=0; i < rows; i++){
			for (int j=0; j < columns; j++){
				System.out.print(twoD_arr[i][j] + " ");
			}
		System.out.println();
		}
	}
}

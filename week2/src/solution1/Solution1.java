package solution1;

public class Solution1 {

	public static void main(String[] args) {

		// int[][] myArr = createArr(5, 5);

		int[][] myArr2 = {  { 1, 2, 3, 4, 5 },
							{ 16, 17, 18, 19, 6 }, 
							{ 15, 24, 25, 20, 7 }, 
							{ 14, 23, 22, 21, 8 },
							{ 13, 12, 11, 10, 9 } };
		System.out.println(myArr2.toString());
		spiralPrinter(myArr2);

	}

	public static int[][] createArr(int n, int m) {

		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				arr[i][j] = (int) (Math.random() * 20);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		return arr;
	}

	public static void spiralPrinter(int[][] arr) {

		int firstRow = 0;
		int endRow = arr.length;
		int firstColumn = 0;
		int endColumn = arr[0].length;
		System.out.println(endRow + " " + endColumn);

		StringBuilder spiral = new StringBuilder();

		while (firstRow < endRow && firstColumn < endColumn) {

			for (int i = firstColumn; i < endColumn; i++) {

				spiral.append(arr[firstRow][i]);
				spiral.append(" ");
			}
			firstRow++;

			for (int i = firstRow; i < endRow; i++) {

				spiral.append(arr[i][endRow - 1]);
				spiral.append(" ");
			}
			endColumn--;

			for (int i = endColumn-1; i >= firstColumn; i--) {

				spiral.append(arr[endRow - 1][i]);
				spiral.append(" ");
			}
			endRow--;
			
			for(int i=endRow-1;i>=firstRow;i--) {
				
				spiral.append(arr[i][firstColumn]);
				spiral.append(" ");
				
			}
			
			firstColumn++;

			
		}

		System.out.println(spiral);

	}
}

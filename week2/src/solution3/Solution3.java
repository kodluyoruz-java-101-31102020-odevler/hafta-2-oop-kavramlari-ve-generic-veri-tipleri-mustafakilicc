package solution3;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {

	public static void main(String[] args) {

		int[] arr = createArr();
		findSameWithLinearSearch(arr);
		System.out.println("---------------------");
		findSameWithSet(arr);

	}

	private static void findSameWithLinearSearch(int[] arr) {

		System.out.println();
		int arrSize = arr.length;
		for (int i = 0; i < arrSize; i++) {

			for (int j = i + 1; j < arrSize; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " is a dublicated number");
					break;
				}

			}
		}

	}

	private static void findSameWithSet(int[] arr) {

		Set<Integer> dublicates = new HashSet<>();
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			boolean state = dublicates.add(arr[i]);

			if (state == false) {
				System.out.println(arr[i] + " is a dublicated number");
			}

		}

	}

	private static int[] createArr() {

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {

			arr[i] = (int) (Math.random() * 10);
			System.out.print(arr[i] + " ");
		}
		return arr;
	}

}

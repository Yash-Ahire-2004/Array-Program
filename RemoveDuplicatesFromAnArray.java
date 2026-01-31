package arrayProgram;

import java.util.Arrays;

public class RemoveDuplicatesFromAnArray {
	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 23, 45, 67, 12 };

		int[] temp = new int[arr.length];
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < k; j++) {
				if (arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				temp[k] = arr[i];
				k++;
			}
		}

		int[] result = Arrays.copyOf(temp, k);
		System.out.println(Arrays.toString(result));
	}
}
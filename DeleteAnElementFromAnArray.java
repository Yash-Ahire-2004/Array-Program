package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAnElementFromAnArray {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 67, 23, 89, 73, 5 };

		System.out.println("Enter the Element to be deleted from an Array " + Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println(num + " is not present in an Array");
		}

		int[] res = new int[arr.length - count];

		int k = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != num) {
				res[k] = arr[j];
				k++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
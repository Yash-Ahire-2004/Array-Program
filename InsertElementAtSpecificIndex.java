package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtSpecificIndex {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 40, 50, 60 };
		System.out.print("Enter the index at which Element to be added: ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		System.out.print("Enter the Elememt to be added: ");
		int element = sc.nextInt();

		int[] res = new int[arr.length + 1];
		if (index >= 0 && index < res.length) {
			res[index] = element;
			int k = 0;
			for (int i = 0; i < res.length; i++) {
				if (i != index) {
					res[i] = arr[k];
					k++;
				}
			}
			System.out.println(Arrays.toString(res));
		} else {
			System.out.println("Index given by user is not available!!!");
			System.out.println("Can't perform insertion!!!!");
		}
	}
}
package arrayProgram;

public class OddNumberInEvenIndex {
	public static void main(String[] args) {
		int[] arr = { 11, 55, 9, 7, 6, 1, 9516, 784, 32, 3351, 1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1 && i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
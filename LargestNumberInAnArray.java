package arrayProgram;

public class LargestNumberInAnArray {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 67, 23, 89, 1 };
		int max = arr[arr.length - 1];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest Number In an Array: " + max);
	}
}
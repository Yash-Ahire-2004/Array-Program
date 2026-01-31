package arrayProgram;

public class SmallestNumberInAnArray {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 67, 23, 89, 1 };
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Number iN an Array: " + min);
	}
}
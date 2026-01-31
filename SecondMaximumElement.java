package arrayProgram;

public class SecondMaximumElement {
	public static void main(String[] args) {
		int[] arr = { 8, 5, 6, 0, 17 };
		int max = arr[0];
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>secondMax && arr[i]<max) {
				secondMax = arr[i];
			}
		}
		System.out.println("Second maximum Element: " + secondMax);
	}
}
package arrayProgram;

public class SecondMinimumElement {
	public static void main(String[] args) {
		int[] arr = { 8, 5, 6, 0, 17 };
		int min = arr[0];
		int secondMin = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<secondMin && arr[i]>min) {
				secondMin = arr[i];
			}
		}
		System.out.println("Second Minimum Element: " + secondMin);
	}
}
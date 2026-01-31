package arrayProgram;

public class PassingArrayReferenceToAMethod {

	public static int sumOfValues(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] b = {};
		int[] c = { 10, 20, 30, 40, 50 };
		System.out.println(sumOfValues(a));
		System.out.println(sumOfValues(b));
		System.out.println(sumOfValues(c));
	}
}
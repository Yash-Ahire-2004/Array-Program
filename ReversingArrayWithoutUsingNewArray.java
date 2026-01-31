package arrayProgram;

public class ReversingArrayWithoutUsingNewArray {
	public static void main(String[] args) {
		String[] arr = { "Shah Rukh Khan", "Aamir Khan", "Salman Khan", "Ranbir Kapoor", "Hrithik Roshan" };
		int k = arr.length - 1;

		for (int i = 0; i < arr.length / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
			k--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

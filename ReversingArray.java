package arrayProgram;

public class ReversingArray {
	public static void main(String[] args) {
		String[] arr = { "Shah Rukh Khan", "Aamir Khan", "Salman Khan", "Ranbir Kapoor", "Hrithik Roshan" };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
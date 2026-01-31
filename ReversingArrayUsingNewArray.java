package arrayProgram;

public class ReversingArrayUsingNewArray {
	public static void main(String[] args) {
		String[] arr = { "Shah Rukh Khan", "Aamir Khan", "Salman Khan", "Ranbir Kapoor", "Hrithik Roshan" };
		String[] out = new String[arr.length];
		int k = 0;

		for (int i = arr.length - 1; i >= 0; i--, k++) {
			out[k] = arr[i];
		}
		
		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}
	}
}

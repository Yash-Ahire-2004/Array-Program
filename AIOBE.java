package arrayProgram;
//AIOBE = ArrayIndexOutOfBoundsException

public class AIOBE {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 67, 23, 89 };
		System.out.println(arr[0]);
		System.out.println(arr[5]); // AIOBE = ArrayIndexOutOfBoundsException
		System.out.println(arr[7]); // AIOBE = ArrayIndexOutOfBoundsException
	}
}
package arrayProgram;
//NPE = NullPointerException

public class NPE {
	public static void main(String[] args) {
		String [] arr = null;
		System.out.println(arr);
		System.out.println(arr[0]);//NPE = NullPointerException
	}
}
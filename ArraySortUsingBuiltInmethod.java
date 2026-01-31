package arrayProgram;

import java.util.Arrays;

public class ArraySortUsingBuiltInmethod {
	public static void main(String[] args) {
		String[] arr = { "Shah Rukh Khan", "Aamir Khan", "Salman Khan", "Ranbir Kapoor", "Hrithik Roshan" };
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}
}
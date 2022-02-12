package fourth;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int[] arr = new int[A];

		for (int i = 0; i < A; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[A - 1]);
		sc.close();
	}

}

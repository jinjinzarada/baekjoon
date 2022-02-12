package fourth;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int i;
		int count = 0;
		int max = 0;

		for (i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				count = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(count);
		sc.close();
	}
}

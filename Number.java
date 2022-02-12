package fourth;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum = A * B * C;
		while (sum > 0) {
			arr[sum % 10]++;
			sum /= 10;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}

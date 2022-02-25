package fifth;

import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String w = sc.next();

		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += w.charAt(i) - '0';

		}
		System.out.println(sum);
		sc.close();
	}

}

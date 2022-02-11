package fourth;

import java.util.Scanner;

public class While_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A + B == 0) {
				break;
			}
			System.out.println(A + B);
		}
		sc.close();
	}
}

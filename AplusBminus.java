package third;

import java.util.Scanner;

public class AplusBminus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();

		for (int i = 0; i < g; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}
		sc.close();
	}

}

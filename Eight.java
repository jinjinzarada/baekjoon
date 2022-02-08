package third;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		for (int i = 1; i <= g; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #" + i + ": "+ A +" + "+ B + " = " + (A + B));
		}
		sc.close();
	}

}

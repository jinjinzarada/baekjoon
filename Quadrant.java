package second;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A > 0 && B > 0) {
			System.out.print("1");
		} else if (A < 0 && B > 0) {
			System.out.print("2");
		} else if (A < 0 && B < 0) {
			System.out.print("3");
		} else if (A > 0 && B < 0) {
			System.out.print("4");
		}
		sc.close();
	}

}

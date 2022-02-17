package fourth;

import java.util.Scanner;

public class OX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			char[] arr = sc.next().toCharArray();
			int num = 0, sum = 0;
			for (char c : arr) {
				if (c == 'O') {
					num++;
					sum += num;
				} else {
					num = 0;
				}
			}
			System.out.println(sum);
			sc.close();
		}
	}
}

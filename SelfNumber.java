package fifth;

import java.io.IOException;
import java.util.HashSet;

public class SelfNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int num = 1, count = 0, numResult;

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 1; i < 10001; i++) {
			set.add(i);

		}

		for (int i = 1; i < 10001; i++) {

			set.remove(d(i));

		}

		for (int numA : set) {
			System.out.println(numA);
		}

	}

	public static int d(int n) {

		String s = Integer.toString(n);
		int resN, sum = n;

		for (int i = 0; i < s.length(); i++) {
			resN = n % 10;
			sum += resN;
			n = n / 10;
		}

		return sum;

	}
}
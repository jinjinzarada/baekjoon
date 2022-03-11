package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Checker {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = N;
		boolean[] alphabet = new boolean[26];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			Arrays.fill(alphabet, false);
			alphabet[str.charAt(0) - 97] = true;
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(j) != str.charAt(j - 1)) {
					count--;
					if (alphabet[str.charAt(j) - 97] == true) {
						count--;
						break;
					} else {
						alphabet[str.charAt(j) - 97] = true;
					}
				}
			}
		}
		System.out.print(count);
	}
}

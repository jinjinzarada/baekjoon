package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repeat {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");

			int n = Integer.parseInt(str[0]);
			String s = str[1];

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < n; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
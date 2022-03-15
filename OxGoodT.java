package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OxGoodT {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int t = 0; t < n; t++) {
			String s = br.readLine();
			int cnt = 0;
			int res = 0;
			int size = s.length();
			for (int i = 0; i < size; i++) {
				if (s.charAt(i) == 'O') {
					cnt++;
					res += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(res);
		}
	}
}

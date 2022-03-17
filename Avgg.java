package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Avgg {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		int n, total, count;
		double avg;
		int scores[] = new int[1000];

		for (int i = 0; i < c; ++i) {
			n = Integer.parseInt(br.readLine());
			total = 0;
			count = 0;
			for (int j = 0; j < n; ++j) {
				scores[j] = Integer.parseInt(br.readLine());
				total += scores[j];
			}
			avg = (double) total / n;

			for (int j = 0; j < n; ++j) {
				if (scores[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / n);
			System.out.println("%");
		}
		br.close();
	}
}

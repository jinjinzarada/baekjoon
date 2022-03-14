package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ox {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arraySize = Integer.parseInt(br.readLine());
		String[] arr = new String[arraySize];
		for (int i = 0; i < arraySize; i++) {
			arr[i] = br.readLine();
		}
		for (int i = 0; i < arraySize; i++) {
			char[] arr2 = arr[i].toCharArray();
			int score = 0;
			int plus = 1;
			for (int k = 0; k < arr2.length; k++) {
				if (arr2[k] == 'O') {
					score += plus;
					plus++;
				} else {
					plus = 1;
				}
			}
			System.out.println(score);
		}

		br.close();

	}

}

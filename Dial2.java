package fifth;

import java.io.IOException;

public class Dial2 {

	public static void main(String[] args) throws IOException {

		int count = 0;
		while (true) {
			int n = System.in.read();
			if (n < 'A')
				break;
			else if (n < 'D')
				count += 3;
			else if (n < 'G')
				count += 4;
			else if (n < 'J')
				count += 5;
			else if (n < 'M')
				count += 6;
			else if (n < 'P')
				count += 7;
			else if (n < 'T')
				count += 8;
			else if (n < 'W')
				count += 9;
			else if (n < '[')
				count += 10;
		}
		System.out.println(count);

	}

}

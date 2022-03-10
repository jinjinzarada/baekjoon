package fifth;

public class SelfNumber02 {
	public static void main(String[] args) {
		int[] sn = new int[10001];
		int count = 1;
		int Self = 0;
		int i = 0;
		while (count < 10000) {
			Self = count;
			i = count;
			while (i != 0) {
				Self += i % 10;
				i /= 10;
			}
			if (Self < 10000)
				sn[Self]++;
			count++;
		}
		for (int j = 1; j <= 9999; j++) {
			if (sn[j] == 0) {
				System.out.println(j);
			}
		}
	}
}

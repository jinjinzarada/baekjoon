package fourth;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[t];
		int max = 0;
		int sum = 0;
		double avg = 0.0;
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
		}
		avg = 100.0 *sum/max/t;
		System.out.println(avg);
		sc.close();
	}
}

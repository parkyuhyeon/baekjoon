package level5;

import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int C = scanner.nextInt();
		
		for (int i = 0; i < C; i++) {
			int N = scanner.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			for (int j = 0; j < N; j++) {
				arr[j] = scanner.nextInt();
			}
			for (int j = 0; j < N; j++) {
				sum += arr[j];
			}
			double avg = (double)sum / N;
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				if (arr[j] > avg) {
					cnt++;
				}
			}
			double result = (double)cnt / N * 100;
			System.out.println(String.format("%.3f", result) + "%");
		}
	}

}

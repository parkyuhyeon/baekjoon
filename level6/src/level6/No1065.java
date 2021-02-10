package level6;

import java.util.Scanner;

public class No1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		System.out.println(arithmeticProgression(N));
	}
	
	static int arithmeticProgression(int N) {
		int cnt = 0;
		
		if (N < 100) {
			cnt = N;
		} else {
			if (N == 1000) {
				N = 999;
			}
			for (int i = 100; i <= N; i++) {
				int one = i % 10;
				int ten = (i / 10) % 10;
				int hundread = i / 100;
				if ((hundread - ten) == (ten - one)) {
					cnt++;
				}
			}
			cnt += 99;
		}
		
		return cnt;
	}

}

package level4;

import java.util.Scanner;

public class No1110 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int num = N;
		int leftN = 0;
		int rightN = 0;
		int sum = 0;
		int newN = 0;
		int cnt = 0;
		
		while (true) {
			if (num < 10) {
				leftN = 0;
				rightN = num;
			} else {
				leftN = num / 10;
				rightN = num % 10;
			}
			
			sum = leftN + rightN;
			newN = (rightN * 10) + (sum % 10);
			cnt++;
			
			if (newN == N) {
				break;
			} else {
				num = newN;
			}
		}
		
		System.out.println(cnt);
	}

}

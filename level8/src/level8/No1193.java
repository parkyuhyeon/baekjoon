package level8;

import java.util.Scanner;

public class No1193 {

	public static void main(String[] args) {
		// 1번 1/1 (1)
		// 2번 1/2 (2)
		// 3번 2/1 (2)
		// 4번 3/1 (3)
		// 5번 2/2 (3)
		// 6번 1/3 (3)
		// 7번 1/4 (4)
		// 8번 2/3 (4)
		// 9번 3/2 (4)
		// 10번 4/1 (4)
		// 11번 5/1 (5)
		// 12번 4/2 (5)
		// 13번 3/3 (5)
		// 14번 2/4 (5)
		// 15번 1/5 (5)
		// (i-1)i/2+1번 ~ i(i+1)/2번 (i)
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int i = 1;
		
		while(true) {
			if (X > ((i - 1) * i / 2) && X <= (i * (i + 1) / 2)) {
				break;
			}
			i++;
		}

		int start = ((i - 1) * i / 2) + 1;
		int remainder = X - start;

		int numerator = 0;
		int denominator = 0;
		
		if (i % 2 != 0) {
			numerator = i - remainder;
			// numerator + denominator == i + 1;
			denominator = i + 1 - numerator;
		} else {
			numerator = 1 + remainder;
			denominator = i + 1 - numerator;
		}
		
		System.out.println(numerator + "/" + denominator);
	}

}

package level8;

import java.util.Scanner;

public class No2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (N == 1) {
			System.out.println(1);
		} else {
			int i = 1;
			int start = 2;
			
			while (start <= N) {
				start = start + (6 * i);
				i++;
			}
			
			System.out.println(i);
		}
	}

}

/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 1
		// 2 - 7(= 2 + (6 * 1 - 1))
		// 8 - 19(= 8 + (6 * 2 - 1)) -> 3
		// 20 - 37(= 20 + (6 * 3 - 1))
		// 38 - 61(= 38 + (6 * 4 - 1)) -> 5
		
		if (N == 1) {
			System.out.println(1);
		} else {
			int i = 1;
			int start = 2;
			while (true) {
				int end = start + (6 * i - 1);
				if (N >= start && N <= end) {
					System.out.println(i + 1);
					break;
				}
				i++;
				start = end + 1;
			}
		}
	}

}
*/
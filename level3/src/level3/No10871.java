package level3;

import java.util.Scanner;

public class No10871 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		
		for (int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			
			if (num < X) {
				System.out.print(num + " ");
			}
		}
	}

}

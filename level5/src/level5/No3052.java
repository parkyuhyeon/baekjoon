package level5;

import java.util.Scanner;

public class No3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean[] arr = new boolean[42];
		int cnt = 0;
		
		for (int i = 0; i < 10; i++) {
			arr[scanner.nextInt() % 42] = true;
		}
		
		for (boolean a : arr) {
			if(a) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}

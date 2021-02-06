package level5;

import java.util.Scanner;

public class No8958 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = new String[scanner.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}

}

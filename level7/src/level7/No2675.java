package level7;

import java.util.Scanner;

public class No2675 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int i = 0; i < T; i++) {
			int R = scanner.nextInt();
			String input = scanner.next();
			String[] arr = input.split("");
			
			for (int j = 0; j < arr.length; j++) {
				String str = arr[j];
				for (int k = 0; k < (R - 1); k++) {
					arr[j] += str;
				}
			}
			
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k]);
			}
			System.out.println();
		}
	}

}

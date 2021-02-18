package level7;

import java.util.Scanner;

public class No1157 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		String[] arr = input.toUpperCase().split("");
		
		int[] cnt = new int[26];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < cnt.length; j++) {
				if (arr[i].charAt(0) == 65 + j) {
					cnt[j] += 1;
				}
			}
		}
		
		int max = 0;
		int index = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				index = i;
			} else if (cnt[i] != 0 && cnt[i] == max) {
				index = -1;
			}
		}
		
		if (index == -1) {
			System.out.println("?");
		} else {
			System.out.println((char)(65 + index));
		}
	}

}

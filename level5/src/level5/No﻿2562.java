package level5;

import java.util.Scanner;

public class No﻿2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[9];
		int max = 0;
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			cnt++;
			if (arr[i] == max) {
				break;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
	}

}

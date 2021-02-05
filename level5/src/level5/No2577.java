package level5;

import java.util.Scanner;

public class No2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		String result = String.valueOf(num1 * num2 * num3);
		String[] arr = result.split("");
		
		int cnt0 = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt5 = 0;
		int cnt6 = 0;
		int cnt7 = 0;
		int cnt8 = 0;
		int cnt9 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[i]) == 0) {
				cnt0++;
			} else if (Integer.parseInt(arr[i]) == 1) {
				cnt1++;
			} else if (Integer.parseInt(arr[i]) == 2) {
				cnt2++;
			} else if (Integer.parseInt(arr[i]) == 3) {
				cnt3++;
			} else if (Integer.parseInt(arr[i]) == 4) {
				cnt4++;
			} else if (Integer.parseInt(arr[i]) == 5) {
				cnt5++;
			} else if (Integer.parseInt(arr[i]) == 6) {
				cnt6++;
			} else if (Integer.parseInt(arr[i]) == 7) {
				cnt7++;
			} else if (Integer.parseInt(arr[i]) == 8) {
				cnt8++;
			} else if (Integer.parseInt(arr[i]) == 9) {
				cnt9++;
			}
		}
		
		System.out.println(cnt0);
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
		System.out.println(cnt4);
		System.out.println(cnt5);
		System.out.println(cnt6);
		System.out.println(cnt7);
		System.out.println(cnt8);
		System.out.println(cnt9);
	}

}

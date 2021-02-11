package level7;

import java.util.Scanner;

public class No11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int[] intArr = new int[N];
		
		String input = scanner.next();
		String[] strArr = input.split("");
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		
		System.out.println(sum);
	}

}

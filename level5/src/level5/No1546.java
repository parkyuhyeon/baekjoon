package level5;

import java.util.Scanner;

public class No1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		double[] arr = new double[N];
		for (int i = 0; i< arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] / max) * 100;
		}
		
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum / N);
	}

}

package level7;

import java.util.Scanner;

public class No2908 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int newNum1 = (num1 / 100) + (((num1 / 10) % 10) * 10) + ((num1 % 10) * 100);
		int newNum2 = (num2 / 100) + (((num2 / 10) % 10) * 10) + ((num2 % 10) * 100);
		
		System.out.println((newNum1 > newNum2) ? newNum1 : newNum2);
	}

}

package level7;

import java.util.Scanner;

public class No2941 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i = 0; i < alphabets.length; i++) {
			input = input.replace(alphabets[i], " ");
		}
		
		System.out.println(input.length());
	}

}

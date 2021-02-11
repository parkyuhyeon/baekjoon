package level7;

import java.util.Scanner;

public class No10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.next();
		
		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		for (int i = 0; i < S.length(); i++) {
			if (alphabet[(S.charAt(i) - 'a')] == -1) {
				alphabet[(S.charAt(i) - 'a')] = i;
			}
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i]);
		}
	}

}

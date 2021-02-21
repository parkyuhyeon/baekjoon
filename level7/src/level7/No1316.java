package level7;

import java.util.Scanner;

public class No1316 {

	public static void main(String[] args) {
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			String input = sc.next();
			if (checker(input) == true) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

	static boolean checker(String input) {
		boolean[] flags = new boolean[26];
		boolean result = true;
		
		flags[(int)input.charAt(0) - 97] = true;
		
		for (int i = 1; i < input.length(); i++) {			
			if (input.charAt(i) != input.charAt(i - 1)) {
				if (flags[(int)input.charAt(i) - 97] == true) {
					result = false;
				} else {
					flags[(int)input.charAt(i) - 97] = true;
				}
			}
		}
		
		return result;
	}
}

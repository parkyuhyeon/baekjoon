package level7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No1152 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		System.out.println(st.countTokens());
	}

}

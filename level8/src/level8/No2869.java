package level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2869 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] array = input.split(" ");
		int[] intArray = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			intArray[i] = Integer.parseInt(array[i]);
		}
		
		int A = intArray[0];
		int B = intArray[1];
		int V = intArray[2];
		
		int day = (V - B) / (A - B);
		
		if (((V - B) % (A - B)) != 0) {
			day++;
		}
		
		System.out.println(day);
	}

}
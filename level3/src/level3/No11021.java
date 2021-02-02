package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No11021 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String input = br.readLine();
			String[] num = input.split(" ");
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			bw.write("Case #" + (i + 1) + ": " + (A + B) + "\n");
		}
		
		bw.flush();
	}

}

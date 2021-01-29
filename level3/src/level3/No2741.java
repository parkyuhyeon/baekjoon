package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2741 {

	public static void main(String[] args) throws Exception {	// 예외 던지기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// Scanner 대신 BufferedReader
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // String으로 읽으므로 int로 파싱해서 변수에 저장
		
		for (int i = 1; i <= N; i++) {
			bw.write(i + "\n");	// BufferedWriter와 System.out.println();을 함께 쓰면 안되므로 "\n"을 사용
		}
		
		bw.flush();	// BufferedWriter 썼으면 flush하기
	}

}

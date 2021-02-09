package level6;

public class No4673 {

	static int d(int n) {
		String[] strArr = String.valueOf(n).split("");
		int[] intArr = new int[strArr.length];
		
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		
		return n + sum;
	}
	
	public static void main(String[] args) {
		boolean[] flag = new boolean[10000];
		
		for (int i = 0; i < 10000; i++) {
			if (d(i) < 10000) {
				flag[d(i)] = true;
			}
		}
		
		for (int i = 0; i < 10000; i++) {
			if (flag[i] == false) {
				System.out.println(i);
			}
		}
	}

}

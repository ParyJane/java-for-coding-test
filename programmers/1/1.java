public class Main {
    
	public static void main(String[] args) {
    
		int n = 6;
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };

		String[] answer = new String[n];
		String str = "";

		for (int i = 0; i < n; i++) {
      // 정수를 이진형식의 문자열로 반환
			str = Integer.toBinaryString(arr1[i] | arr2[i]); // 비트 OR 연산자
      // 자릿수 맞추기
			if (str.length() != n) {
				str = "0".repeat(n - str.length()) + str;
			}
			str = str.replaceAll("1", "#");
			str = str.replaceAll("0", " ");
			answer[i] = str;
		}
    
    for(String a : answer) {
        System.out.println(a);
    }
    
  }
  
}

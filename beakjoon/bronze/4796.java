import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 캠핑 */
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 1;
		
		while(true) {
			String str = br.readLine();
			if("0 0 0".equals(str)) break;
			
			StringTokenizer st = new StringTokenizer(str);
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			answer = (V / P) * L + Math.min(V % P, L);
			
			sb.append("Case " + n + ": " + answer).append("\n");
			n++;
		}
		
		System.out.println(sb.toString());
		
	}

}

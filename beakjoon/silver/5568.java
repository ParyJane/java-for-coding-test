import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* 카드 놓기 */
public class Main {
	
	public static Set<String> set = new HashSet<String>();
	public static int[] cards;
	public static boolean[] visited;
	
	public static void recursion(int cnt, String str) {
		if(cnt == 0) {
			set.add(str);
			return;
		}
		
		for(int i = 0; i < cards.length; i++) {
			// 방문 안했을경우 
			if(!visited[i]) {
				visited[i] = true; // 방문처리 
				recursion(cnt-1, str + cards[i]); // 카드 조합
				visited[i] = false; // 방문처리 해제 
			}
		}
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 카드의 개수 
		int m = Integer.parseInt(br.readLine()); // 조합할 수 있는 개수 
		cards = new int[n];
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(br.readLine());
		}
		
		recursion(m, "");
		System.out.println(set.size());
		
	}

}

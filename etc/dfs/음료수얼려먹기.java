/* 음료수 얼려 먹기 */
/*
4 5
00110
00011
11111
00000
*/
import java.util.Scanner;

public class chapter05_1 {
	
	// DFS로 특정 노드를 방문하고 연결된 모든 노드들을 방문 
	public static int dfs(int[][] graph, int x, int y) {
		
		// 범위를 넘어가면 return
		if(x < 0 || x >= graph.length || y < 0 || y >= graph[0].length) {
			return 0;
		}
		
		// 최초 0 일때 cnt++
		if(graph[x][y] == 0) {
			// 해당 노드 방문처리 
			graph[x][y] = 1;
			// 상하좌우(주변)에 있는 0을 1로 변경 
			dfs(graph, x-1, y);
			dfs(graph, x+1, y);
			dfs(graph, x, y-1);
			dfs(graph, x, y+1);
			return 1;
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		int[][] graph = new int[n][m];
		int cnt = 0;
		
		// 2차원 리스트의 맵 정보 입력받기 
		for(int i = 0; i < n; i++) {
			String c = sc.nextLine();
			for(int j = 0; j < m; j++) {
				graph[i][j] = c.charAt(j) - '0';
			}
		}
		
		// 모든 노드에 대하여 음료수 채우기 
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				cnt += dfs(graph, i, j);
			}
		}
		
		System.out.println(cnt);

	}

}

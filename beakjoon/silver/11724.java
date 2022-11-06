package backJoonTest.solved.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* 연결 요소의 개수 */
public class silver_11724 {
	
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static boolean[] visited;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1];
		
		// 그래프 초기화 
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		// 그래프 값 채우기 
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			if(node1 > node2) {
				int temp = node1;
				node1 = node2;
				node2 = temp;
			}
			graph.get(node1).add(node2);
            		graph.get(node2).add(node1);
		}
		
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(dfs(i)) cnt++;
		}
		
		System.out.println(cnt);
		
	}
	
	public static boolean dfs(int index){
		
		// 방문처리 됐다면 리턴 
		if(visited[index] == true) return false;
		// 방문처리 
		visited[index] = true;
		
		for(int i = 0; i < graph.get(index).size(); i++) {
            	int node = graph.get(index).get(i);
            	if(!visited[node]) dfs(node);
        }
		
		return true;
	}

}

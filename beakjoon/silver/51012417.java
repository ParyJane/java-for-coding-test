import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static StringBuilder sb = new StringBuilder();
    public static boolean[] visited;
    
    public static void dfs(int v) {
        
        sb.append(v).append(" ");
        visited[v] = true;
        
        // for문이 다 돌기 전에 재귀함수가 먼저 실행 
        for(int i = 0; i < graph.get(v).size(); i++) {
            int node = graph.get(v).get(i);
            if(!visited[node]) dfs(node);
        }
        
    }
    
    public static void bfs(int v) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(v);
        visited[v] = true;
        
        while(!q.isEmpty()) {
            int temp = q.poll();
            sb.append(temp).append(" ");
            for(int i = 0; i < graph.get(temp).size(); i++) {
                int node = graph.get(temp).get(i);
                if(!visited[node]) {
                    q.offer(node);
                    visited[node] = true;
                }
            }
        }
        
    }
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int v = Integer.parseInt(arr[2]);       
        
        visited = new boolean[n+1];
        
        // 그래프 초기화 
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < m; i++) {
            String[] nodes = br.readLine().split(" ");
            int x = Integer.parseInt(nodes[0]);
            int y = Integer.parseInt(nodes[1]);
            // 양방향 간선 
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        // 정점 번호가 작은것을 우선순위 
        for(int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
        
        dfs(v);
        sb.append("\n");
        Arrays.fill(visited, false);
        bfs(v);
        
        System.out.println(sb.toString());
        
    }
    
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 유기농 배추 */
class Main {
    
    public static int[][] graph;
  
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        
        while(t != 0) {
          
            String[] str1 = br.readLine().split(" ");
            int n = Integer.parseInt(str1[0]);
            int m = Integer.parseInt(str1[1]);
            int k = Integer.parseInt(str1[2]);
            
            // 그래프 초기화
            graph = new int[n][m];
            for(int i = 0; i < k; i++) {
                String[] str2 = br.readLine().split(" ");
                int x = Integer.parseInt(str2[0]);
                int y = Integer.parseInt(str2[1]);
                graph[x][y] = 1;
            }
            
            int cnt = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(dfs(i, j)) cnt++;
                }
            }
            
            sb.append(cnt).append("\n");
            t--;
        }
        
        System.out.println(sb.toString());
    }
    
    
    public static boolean dfs(int x, int y) {
        
        // 범위를 넘으면 return
        if(x < 0 || x >= graph.length || y < 0 || y >= graph[0].length) return false;
        // 배추가 없으면 return
        if(graph[x][y] == 0) return false;
        
        // 방문처리
        graph[x][y] = 0;
      
        // 인접(상하좌우) 배추 확인
        dfs(x-1, y);
        dfs(x+1, y);
        dfs(x, y-1);
        dfs(x, y+1);
        
        return true;
    }
    
}

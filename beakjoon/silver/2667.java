import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
/* 단지번호 */
public class Main {
    
    public static int[][] graph;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        
        // 그래프 초기화
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int j = 0; j < N; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int sum = dfs(i, j, 0);
                if(sum != 0) list.add(sum);
            }
        }
        
        int[] result = list.stream()
                         .mapToInt(i -> i)
                         .sorted()
                         .toArray();
        
        sb.append(result.length).append("\n");
        for(int num : result) {
            sb.append(num).append("\n");
        }
        
        System.out.println(sb.toString());
    }
    
    public static int dfs(int x, int y, int sum) {
        
        // 범위를 벗어나면 return
        if(x < 0 || x >= graph.length || y < 0 || y >= graph[0].length) return 0;
        // 집이 없는 곳은 return
        if(graph[x][y] == 0) return 0;
        
        graph[x][y] = 0;
        sum++;
        
        int[] row = {-1, 1, 0, 0};
        int[] col = {0, 0, -1, 1};
        
        for(int i = 0; i < 4; i++) {
            int dx = x + row[i];
            int dy = y + col[i];
            sum += dfs(dx, dy, 0);
        }
        
        return sum;
    }
}

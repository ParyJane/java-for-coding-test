import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    
    // 좌표를 담을 클래스 선언
    static class Coordinate {
        
        private int x;
        private int y;
        
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public int getX() {
            return x;
        }
        
        public int getY() {
            return y;
        }
        
    }
    
    public static int n, m;
    public static int[][] graph;
    
    public static void bfs(int x, int y) {
        
        Queue<Coordinate> q = new LinkedList<Coordinate>();
        q.offer(new Coordinate(x, y));
        
        // 상하좌우 좌표 이동
        int[][] temp = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while(!q.isEmpty()) {
            Coordinate cd = q.poll();
            x = cd.getX();
            y = cd.getY();
            for(int i = 0; i < temp.length; i++) {
                int dx = x + temp[i][0];
                int dy = y + temp[i][1];
                if(dx < 0 || dx >= n || dy < 0 || dy >= m) continue;
                if(graph[dx][dy] == 1) {
                    q.offer(new Coordinate(dx, dy));
                    graph[dx][dy] += graph[x][y];
                }
            }
        }
        
    }
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        n = Integer.parseInt(arr[0]);
        m = Integer.parseInt(arr[1]);
        graph = new int[n][m];
        
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        
        bfs(0, 0);
        System.out.println(graph[n-1][m-1]);
        
    }
    
}

class Solution {
    
    public static int n, answer;
    public static boolean[] visited;
    public static int[] arr;
    
    public int solution(int[] number) {
        
        arr = number;
        n = arr.length;
        visited = new boolean[n];
        
        bfs(0, 0, 3);
        
        return answer;
    }
    
    public static void bfs(int depth, int sum, int r) {
        if(r == 0) {
            if(sum == 0) answer++;
            return;
        }
        
        if(depth == n) return;
        
        // 선택했을때 sum에 해당 인덱스의 값 더하기
        visited[depth] = true;
        bfs(depth + 1, sum + arr[depth], r - 1);
        
        // 선택하지 않았을때 sum 그대로 유지 
        visited[depth] = false;
        bfs(depth + 1, sum, r);
    }

}

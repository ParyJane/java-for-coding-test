class Solution {
    public static int[][] graph;
    
    public static int rotate(int[] query) {
		
		int x1 = query[0] - 1; // 1
		int y1 = query[1] - 1; // 2
		int x2 = query[2] - 1; // 3
		int y2 = query[3] - 1; // 4
		
		// 시작위치 잡아두기 
		int temp = graph[x1][y1];
		int min_value = temp;
		
		// 1번회전
		for(int i = x1; i < x2; i++) {
			graph[i][y1] = graph[i+1][y1];
			min_value = Math.min(min_value, graph[i][y1]);
		}
		// 2번회전
		for(int i = y1; i < y2; i++) {
			graph[x2][i] = graph[x2][i+1];
			min_value = Math.min(min_value, graph[x2][i]);
		}
		// 3번회전
		for(int i = x2; i > x1; i--) {
			graph[i][y2] = graph[i-1][y2];
			min_value = Math.min(min_value, graph[i][y2]);
		}
		// 4번회전 
		for(int i = y2; i > y1; i--) {
			graph[x1][i] = graph[x1][i-1];
			min_value = Math.min(min_value, graph[x1][i]);
		}
		
		graph[x1][y1+1] = temp;
		
		return min_value;
	}
    
    public int[] solution(int rows, int columns, int[][] queries) {
        graph = new int[rows][columns];
		int[] answer = new int[queries.length];
		
		// 그래프 초기화 
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				graph[i][j] = (i * columns) + j + 1;
			}
		}
		
		for(int i = 0; i < queries.length; i++) {
			answer[i] = rotate(queries[i]);
		}
		
        return answer;
    }
}

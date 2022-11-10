import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    
    public static boolean[] visited = new boolean[10001];
    
    public int[] solution(int n) {
      
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                if(!visited[i]) {
                    set.add(i);
                    deduplication(i);
                }
                n /= i;
            }
        }
        
        // Set to Array
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
    
    // 중복 제거 
    public static void deduplication(int index) {
        for(int i = index; i < visited.length; i += index ) {
            visited[i] = true;
        }
    }
}

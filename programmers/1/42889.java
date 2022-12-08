import java.util.HashMap;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    
    public int[] solution(int N, int[] stages) {
        
        int[] answer = new int[N];
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        
        Arrays.sort(stages);
        
        // 실패율 구하기
        for(int i = 1; i <= N; i++) {
            double arrive = 0;
            int clear = 0;            
            for(int j = i - 1; j < stages.length; j++) {
                if(stages[j] >= i) {
                    if(stages[j] == i) arrive++;
                    clear++;
                } 
            }
            map.put(i, (clear == 0 ? 0 : arrive / clear));
        }
        
        // 실패율이 높은 순서대로 정렬
        List<Entry<Integer, Double>> entries = map.entrySet().stream()
                                        .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                                        .collect(Collectors.toList());
        
        // 출력
        int index = 0;
        for(Entry<Integer, Double> entry : entries) {
            answer[index++] = entry.getKey();
	    //System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        
        return answer;
    }
}

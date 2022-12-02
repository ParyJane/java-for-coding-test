import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        // numlist를 내림차순으로 정렬
        numlist = Arrays.stream(numlist)
                    .boxed().sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        
        // 두 수의 차와 해당 인덱스를 담은 배열
        int[][] gap = new int[numlist.length][2];
        for(int i = 0; i < numlist.length; i++) {
            int k = Math.max(numlist[i], n) - Math.min(numlist[i], n);
            gap[i][0] = k; 
            gap[i][1] = i;
        }
        
        // 두 수의 차가 적은 순서대로 오름차순 정렬
        Arrays.sort(gap, Comparator.comparing(i -> i[0]));
        
        // n과 가까운 순서대로 정렬한 배열
        int[] answer = new int[numlist.length];
        for(int i = 0; i < numlist.length; i++) {
            int index = gap[i][1];
            answer[i] = numlist[index];
        }
        
        return answer;
    }
}

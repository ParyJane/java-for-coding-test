// 로또의 최고 순위와 최저 순위

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zero = 0;
        for(int num : lottos) {
            if(num == 0) {
                zero++;
                continue;
            }
            boolean found = Arrays.stream(win_nums)
                            .boxed()
                            .collect(Collectors.toSet())
                            .contains(num);
            if(found) cnt++;
        }
        
        int minRank = cnt;
        int maxRank = cnt + zero;
        answer[0] = (maxRank < 2 ? 6 : 7 - maxRank);
        answer[1] = (minRank < 2 ? 6 : 7 - minRank);
        
        return answer;
    }
    
}

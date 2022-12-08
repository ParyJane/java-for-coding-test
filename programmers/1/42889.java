import java.util.ArrayList;
/* 실패율 */
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<double[]> failureRate = new ArrayList<double[]>();
        
        // 실패율 구하기 
        for(int i = 1; i <= N; i++) {
            double arrive = 0;
            int clear = 0;
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] >= i) {
                    if(stages[j] == i) arrive++;
                    clear++;
                }
            }    
            if(clear == 0) {
                failureRate.add(new double[] {i, 0});
                continue;
            }
            failureRate.add(new double[] {i, arrive/clear});
        }
        
        // 실패율 내림차순으로 정렬하기 
        failureRate.sort((a, b) -> Double.compare(b[1], a[1]));
        
        // 출력
        for(int i = 0; i < N; i++) {
            answer[i] = (int)failureRate.get(i)[0];
            //System.out.println((int)failureRate.get(i)[0] + "/" + failureRate.get(i)[1]);
        }
        
        return answer;
    }
}

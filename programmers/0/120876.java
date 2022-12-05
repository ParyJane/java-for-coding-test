import java.util.*;
/* 겹치는 선분의 길이 */
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] lineArr = new int[201];

        Arrays.sort(lines, Comparator.comparing(i->i[0]));

        if(lines[0][1] <= lines[1][0] && lines[1][1] <= lines[2][0]) return 0;

        for(int[] line : lines) {
            for(int i = line[0]; i < line[1] + 1; i++) {
                lineArr[i+100]++;
            }
        }

        for(int i = 1; i < lineArr.length; i++) {
            if(lineArr[i-1] > 1 && lineArr[i] > 1) answer++;
        }

        return answer;
    }
}

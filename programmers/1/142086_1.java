// [가장 가까운 같은 글자] 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 글자 찾기
// 1. 문자열을 char[]로 변환
// 2. index 검색해서 현재 인덱스와 같으면 -1 반환
// 3. 다르면 현재 인덱스(i) - 앞선 인덱스(index) 반환 
// 4. arr[index] 값 변경

import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            int index = String.valueOf(arr).indexOf(arr[i]);
            if(index == i) {
                answer[i] = -1;
            } else {
                answer[i] = i - index;
                arr[index] = 0;
            }
        }
        
        return answer;
    }
}

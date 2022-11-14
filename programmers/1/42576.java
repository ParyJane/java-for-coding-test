import java.util.HashMap;
import java.util.Map.Entry;
/* 완주하지 못한 선수 */
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
	// 참가자 명단 초기화
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(String p : participant) {
            if(!hm.containsKey(p)) hm.put(p, 1);
            else hm.put(p, hm.get(p) + 1);
        }
        
	// 완주자 명단과 비교하여 해당 선수가 존재할 시 value--
        for(String c : completion) {
            if(hm.containsKey(c)) hm.put(c, hm.get(c) - 1);
        }
        
	// value가 0이 아닌 경우 찾기
        for(Entry<String, Integer> e : hm.entrySet()) {
            if(e.getValue() != 0) {
                answer = e.getKey();
                break;
            }
        }

        return answer;
    }
}

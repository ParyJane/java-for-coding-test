// [프로그래머스] 크기가 작은 부분 문자열

class Solution {    
    public int solution(String t, String p) {
        int answer = 0;
        long tn = 0;
        long pn = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - p.length(); i++) {
            if(t.charAt(i) <= p.charAt(0)) {
                tn = Long.parseLong(t.substring(i, i + p.length()));
                if(tn <= pn) answer++;
            }
        }
            
        return answer;
    }
}

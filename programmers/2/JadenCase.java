// 프로그래머스 JadenCase 문자열 만들기

import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s.toLowerCase(), " " ,true);

        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            String c = Character.toString(str.charAt(0));
            str = str.replaceFirst(c, c.toUpperCase());
            answer.append(str);
        }

        return answer.toString();
    }
}

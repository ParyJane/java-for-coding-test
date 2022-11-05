class Solution {
    public int solution(String str1, String str2) {
        // 문자열 str1에 str2가 포함되어있다면 true, 포함되어있지 않다면 false
        return str1.contains(str2) ? 1 : 2;
    }
}

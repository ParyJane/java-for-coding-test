class Solution {
    /* 푸드 파이트 대회 */
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i]/2));
        }
        String answer = sb.toString() + "0";
        answer += sb.reverse();
        return answer;
    }
}

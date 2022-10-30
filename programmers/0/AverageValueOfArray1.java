class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(double num : numbers) {
            answer += num;
        }
        return answer/numbers.length;
    }
}

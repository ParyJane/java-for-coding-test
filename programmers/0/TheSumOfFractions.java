class Solution {

    // 최대공약수(유클리드 호제법)
    public int gdc(int x, int y) {
        if(x % y == 0) return y;
        return gdc(y, x % y);
    }
    
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        
        int num3  = (num1 * num2) / gdc(num1, num2); // 분자(최소공배수)
        int denum3 = (num3 / num1 * denum1) + (num3 / num2 * denum2); // 분모
        int result = gdc(num3, denum3); // 기약분수
        
        int[] answer = {denum3/result, num3/result};
        
        return answer;
    }
}

/* 숫자 찾기 */
class Solution {
    public int solution(int num, int k) {
        
        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);
        
        if(!strNum.contains(strK)) return -1;
        return strNum.indexOf(strK) + 1;
    }
}

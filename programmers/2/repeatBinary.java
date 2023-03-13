// 이진 변환 반복하기

class Solution {
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        toBinary(s, answer);
        return answer;
    }
    
    public static void toBinary(String before, int[] arr) {
        if(before.equals("1")) return;
        
        String after = before.replace("0", "");
        arr[0]++;
        arr[1] += before.length() - after.length();
        
        toBinary(Integer.toBinaryString(after.length()), arr);
    }
}

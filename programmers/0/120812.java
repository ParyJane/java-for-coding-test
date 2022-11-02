class Solution {
    
    public int solution(int[] array) {
        
        int[] result = new int[1001];
        if(array.length == 1) return array[0];
        
        for(int i = 0; i < array.length; i++) {
            result[array[i]] += 1;
        }

        int max = 0;
        int answer = 0;
        for(int i  = 0; i < result.length; i++) {
            if(max < result[i]) {
                max = result[i];
                answer = i;
            } else if(max == result[i]) {
                answer = -1;
            }
        }
        
        return answer;
    }
}

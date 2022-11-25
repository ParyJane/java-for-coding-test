import java.util.Set;
import java.util.HashSet;

/* 프로그래머스 - 소수찾기 */
class Solution {
    
    static String[] arr;
    static Set<Integer> set = new HashSet<Integer>();
    
    public int solution(String numbers) {
        int answer = 0;
        arr = numbers.split("");
        
        // 숫자 조합하기
        for(int i = 1; i <= arr.length; i++) {
            permutation(0, arr.length, i);
        }
        
        // 소수가 count
        for(int num : set) {
            if(findPrimeNumber(num)) answer++;
        }
        
        return answer;
    }
    
    // 순열 만들기(1) : r은 조합할 수의 개수 
    static void permutation(int depth, int n, int r) {
        if(depth == r) {
            // 조합한 숫자 Set에 저장(중복 제거)
            String num = "";
            for(int i = 0; i < r; i++) {
                num += arr[i];
            }
            set.add(Integer.parseInt(num));
            return;
        }
        
        for(int i = depth; i < n; i++) {
            swap(depth, i);
            permutation(depth+1, n, r);
            swap(depth, i);
        }
        
    }
    
    // 순열 만들기(2) - swap
    static void swap(int depth, int index) {
        String temp = arr[depth];
        arr[depth] = arr[index];
        arr[index] = temp;
    }
    
    // 소수찾기
    static boolean findPrimeNumber(int num) {
        if(num <= 1) return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}

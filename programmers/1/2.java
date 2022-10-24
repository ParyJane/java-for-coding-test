public class main {
  
    public static boolean minority(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(minority(sum)) answer++;
                }
            }
        }

        System.out.println(answer);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    
    public static int recursion(int cnt, int a, int b) {
        
        int sum = a + b;
        if(cnt < 3) return sum;
        
        return recursion(cnt - 1, b, sum);
        
    }
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        if(n == 0) System.out.println(0);
        else System.out.println(recursion(n, 0, 1));
        
    }
    
}

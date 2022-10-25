import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	  public static int recursion(int n) {
      
        if(n == 1 || n == 0) return 1; // 1! = 0! = 1
        return n * recursion(n - 1);   // n! = n * (n - 1)!
    
    }
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
      
        System.out.println(recursion(n));
      
    }

}

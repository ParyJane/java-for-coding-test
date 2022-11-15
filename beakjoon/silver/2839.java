import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int sum = N;
        
        while(sum > 0) {
            if(sum % 5 == 0) {
                answer += (sum / 5);
                sum = 0;
                break;
            }
            sum -= 3;
            answer++;
        }
        
        System.out.println(sum == 0 ? answer : -1);
    }
}

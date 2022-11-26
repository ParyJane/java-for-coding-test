import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 한조서열정리하고옴ㅋㅋ */
class Main {
    public static void main(String[] args) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        // 산 높이를 담은 배열 초기화  
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int answer = 0;
        int now = 0;
        int cnt = 0;
        for(int i = 1; i < n; i++) {
            if(arr[now] > arr[i]) {
                cnt++;
            } else {
                now = i;
                cnt = 0;
            }
            answer = Math.max(answer, cnt);
        }
        
        System.out.println(answer);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/* 나이순 정렬 */
public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Integer, String> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		boolean[] visited = new boolean[201];
        
		int n = Integer.parseInt(br.readLine());
		int[] keys = new int[n];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int age = Integer.parseInt(st.nextToken());
			keys[i] = age;
			
			if(map.containsKey(age)) {
				str = map.get(age) + "\n" + str;
			} 
			map.put(age, str);
			visited[age] = true;
		}
		
		Arrays.sort(ages);
		
		for(int age : keys) {
			if(visited[age]) {
				sb.append(map.get(age)).append("\n");
				visited[age] = false;
			}
		}
		
		System.out.println(sb.toString());
	}

}

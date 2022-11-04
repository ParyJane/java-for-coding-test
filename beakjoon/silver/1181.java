import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		String[] arr = set.toArray(new String[0]);
		Arrays.sort(arr);
		Arrays.sort(arr, Comparator.comparing(String::length));
		
		StringBuilder sb = new StringBuilder();
		for(String str : arr) {
			sb.append(str).append("\n");
		}
		
		System.out.println(sb.toString());
	}

}


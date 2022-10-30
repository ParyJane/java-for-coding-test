import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/* 숨바꼭질 */
public class Main {

	public static int[] visited = new int[100001];

	public static void bfs(int n, int k) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);

		visited[n] = 0;

		while (visited[k] == -1) {
			int x = q.poll();
			for (int i = 0; i < 3; i++) {
				int temp = x;
				if (i == 0) temp *= 2;
				else if (i == 1) temp += 1;
				else if (i == 2) temp -= 1;

				if (temp < 0 || temp > 100000) continue;
				if (visited[temp] != -1) continue;

				visited[temp] = visited[x] + 1;
				q.offer(temp);
			}
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		Arrays.fill(visited, -1);

		bfs(n, k);
		System.out.println(visited[k]);

	}

}

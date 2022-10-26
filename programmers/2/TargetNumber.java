/* 타겟 넘버 */
public class Main {
	
	public static int answer = 0;
	
	public static void dfs(int[]numbers, int target, int index, int sum) {
		
		if(index == numbers.length) {
			if(sum == target) {
				answer++;
				return;
			}
		} else {
			// 해당 인덱스가 양수일 경우
			dfs(numbers, target, index + 1, sum + numbers[index]);
			// 해당 인덱스가 음수일 경우 
			dfs(numbers, target, index + 1, sum - numbers[index]);
		}
		
	}

	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		
		dfs(numbers, target, 0, 0);
		
		System.out.println(answer);

	}

}

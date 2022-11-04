import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // copyOfRange(복사할 배열, 시작 index, 마지막 요소의 바로 다음 index)
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}

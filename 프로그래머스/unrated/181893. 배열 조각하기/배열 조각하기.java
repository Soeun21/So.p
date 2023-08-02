import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;

        for(int i = 0; i < query.length; i++) {
        	// System.out.println(Arrays.toString(answer));
        	int tmp = query[i];
        	if(i % 2 == 0) {
        		answer = Arrays.copyOfRange(answer, 0, tmp+1);
        		// System.out.println("1" + Arrays.toString(answer));
        	}
        	else  {
        		answer = Arrays.copyOfRange(answer, tmp, answer.length);
        		// System.out.println("2" + Arrays.toString(answer));
        	}
        }
        return answer;
    }
}
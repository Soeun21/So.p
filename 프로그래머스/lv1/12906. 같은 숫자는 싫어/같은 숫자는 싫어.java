import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i = arr.length-1;i >= 0;i-- ) {
        	if(st.empty()) {
        		st.push(arr[i]);
        	}
        	else if(st.peek() != arr[i]) {
        		st.push(arr[i]);
        	}
        }
        int[] answer = new int[st.size()];
        // System.out.println(st);
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = st.pop();
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        return answer;
    }
}
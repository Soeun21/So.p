import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int l, int r) {
        int cnt = 0;
		  
		  List<Integer> li = new ArrayList<>();
	        String str = "";
	        
	        for(int i = l; i <= r; i++) {
	        	str += i;
	        	str = str.replace("0","");
	        	str = str.replace("5","");
	        	if(str.length() == 0) {
	        		System.out.println("cnt" + cnt);
	        		li.add(cnt,i);
	        		System.out.println("li : " + li);
	        		str = "";
	        		cnt += 1;
	        	}
	        	else if(str.length() > 0) {	        		
	        		str = "";
	        	}
	        }
	        int[] answer = li.size() != 0 ? new int[li.size()] : new int[1];
	        answer[0] = -1;
	        System.out.println(li.size());
	        for(int i = 0; i < li.size();i++) {
	        	answer[i] = li.get(i);
	        }
	        return answer;
    }
}
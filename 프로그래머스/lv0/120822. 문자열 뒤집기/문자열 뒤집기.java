class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i <= answer.length(); i++) {
	        	if(my_string.length() != 0) {
	        		answer += my_string.substring(my_string.length()-1);
	        		System.out.println(answer);
	        		System.out.println(my_string);
	        		my_string = my_string.substring(0,my_string.length()-1);
	        	}
	        	else {
	        		break;
	        	}
	        }
	        return answer;
    }
}
class Solution {
    public int solution(int n) {
       int answer = 0;
        for(int i = 1; i *i <= n; i++){
        	if(n % i == 0 ){
        		answer += 1;
        		// System.out.println("i =" + i );
        		if(n / i != i) {
        			answer++;
        			// System.out.println(i );
        		}
        	}      
        }
        return answer;
    }
}
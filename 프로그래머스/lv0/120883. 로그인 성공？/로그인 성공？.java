class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pass = id_pw[1];
        boolean ID_PASS = false;
        boolean ID = false;
        
        for(int i = 0; i < db.length; i++) {
        	if(db[i][0].equals(id)) {
        		if(db[i][1].equals(pass)) {
        			ID_PASS = true;
        			break;
        		}
        		else 
        			ID = true;
        		break;
        	}
        }
        
        if(ID_PASS == true) {
        	answer = "login";
        }
        else if(ID == true)
        	answer = "wrong pw";
        else
        	answer = "fail";
       
        return answer;
    }
}
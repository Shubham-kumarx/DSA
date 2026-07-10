class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        int j = 0;
        int count = 0;
        
        for(int i = 0; i < t.length(); i++){
            if(s.length() == j) break;
            if(s.charAt(j) == t.charAt(i)){
                j++;
                count++;
            }
            
        }
        if(count == s.length()) return true;
        return false; 
    }
}
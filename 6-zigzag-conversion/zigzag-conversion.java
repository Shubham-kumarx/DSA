class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        if(numRows == 1 || s.length() <= numRows) return s;
        for(int i = 0; i < numRows; i++){
            int idx = i;
            int goingDown = 2 * (numRows - 1 - i);
            int goingUp = 2 * i;
            boolean isGoingDown = true;
            while(idx < s.length()){
                sb.append(s.charAt(idx));
                if(i == 0){
                    idx += goingDown;
                } else if(i == numRows - 1) idx += goingUp;
                else{
                    if(isGoingDown){
                        idx += goingDown; 
                    } else idx += goingUp;
                    isGoingDown = !isGoingDown;
                }
            } 
        }
        return sb.toString();
    }
}
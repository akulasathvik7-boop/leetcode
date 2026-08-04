class Solution {
    public boolean areNumbersAscending(String s) {
       int prev=-1;
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    sb.append(s.charAt(i));
                    i++;
                }

            int cur = Integer.parseInt(sb.toString());
            
            if(cur<=prev){
                return false;
            }
            prev=cur;
            sb.setLength(0);
            }
            else{
                i++;
            }

        }

        return true;
    }
}
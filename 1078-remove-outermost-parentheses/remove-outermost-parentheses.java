class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int index=0;
        int count=0;
        while(index<s.length()){
            if(s.charAt(index)==')'){
                count--;
            }

            if(count!=0)res.append(s.charAt(index));

            if(s.charAt(index)=='(')count++;

            index++;
        } 
        return res.toString();
    }
}
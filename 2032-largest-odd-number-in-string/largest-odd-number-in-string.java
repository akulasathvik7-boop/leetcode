class Solution {
    public String largestOddNumber(String num) {
        if((int)num.charAt(num.length()-1)%2==1) return num;
        int idx=num.length()-1;
        while(idx>=0){
            int n=num.charAt(idx);
            if(n%2==1)return num.substring(0,idx+1);
            idx--;
        }
        return "";
    }
}
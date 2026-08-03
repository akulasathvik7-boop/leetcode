class Solution {
    public static String reverseWords(String str) {
       
        str=str.trim();
        StringBuilder sb = new StringBuilder();
        int idx=str.length()-1;
        int count=0;
        while(idx>=0){
            if(str.charAt(idx) == ' '){
                sb.append(str.substring(idx+1,idx+count+1)+" ");
                count=0;
            while(str.charAt(idx-1)==' ')idx--;
            }else{
                count+=1;
            }
            idx--;
        }
        sb.append(str.substring(0,0+count));
        return sb.toString();
    }
    public static void main(String a[]){
        System.out.println(reverseWords("the sky is blue"));
    }
}
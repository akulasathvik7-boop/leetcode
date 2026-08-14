class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int res=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.get(s.charAt(j))>2&&i<j){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}
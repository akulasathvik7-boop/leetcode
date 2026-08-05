class Solution {
    public int beautySum(String s) {
        int n=s.length();
        char[] count=s.toCharArray();
        int sum=0;
        for(int i=0;i<n;i++){
            int arr[]=new int[26];
            for(int j=i;j<n;j++){
                arr[count[j]-'a']++;

                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                 for (int K : arr) {
                    if (K != 0) {
                        max = Math.max(max, K);
                        min = Math.min(min, K);
                    }
                 }
                sum+=(max-min);
            }
        }
        return sum;
    }
}
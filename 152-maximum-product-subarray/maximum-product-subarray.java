class Solution {
    public int maxProduct(int[] arr) {
        int max=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<arr.length;i++){
            prefix*=arr[i];
            suffix*=arr[arr.length-i-1];
            max=Math.max(max,Math.max(prefix,suffix));
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            
        }
        // if(arr[arr.length-1]<0&&product==1)return 0;
        return max;
    }
}
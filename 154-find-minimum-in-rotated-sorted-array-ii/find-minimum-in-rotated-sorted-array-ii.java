class Solution {
    public int findMin(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[low]==arr[mid]&&arr[mid]==arr[high]){
                ans=Math.min(ans,arr[low]);
                low+=1;
                high-=1;
                continue;
            }
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        if(arr.length==1)return arr[0];
        return ans;
    }
}
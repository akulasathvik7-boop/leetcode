class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer>set=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i=1;
        while(i<=nums.length){
            if(!set.contains(k*i))break;
            i++;
        }
        return k*i;
    }
}
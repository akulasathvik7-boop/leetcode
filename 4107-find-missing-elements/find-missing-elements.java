class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer>res=new ArrayList<>();
        int idx=0;
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(i!=nums[idx])res.add(i);
            else idx++;
        }
        return res;
    }
}
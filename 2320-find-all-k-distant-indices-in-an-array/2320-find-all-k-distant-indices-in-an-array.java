class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> keyIndices = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]==key)
            keyIndices.add(i);
        }

        for(int i =0;i<nums.length;i++){
            for(int j :keyIndices){
                if(Math.abs(i-j)<=k){
                ans.add(i);
                break;
                }
                
            }
        }
        return ans;
    }
}
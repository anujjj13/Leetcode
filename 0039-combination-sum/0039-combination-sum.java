class Solution {
    private void findcomb(int idx , int[] arr ,int target , List<List<Integer>> ans,List<Integer> ds){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            findcomb(idx,arr,target-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        findcomb(idx+1,arr,target,ans,ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findcomb(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
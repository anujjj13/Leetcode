class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> nextGreater=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int num:nums2){
            while(!s.isEmpty() && s.peek()<num){
                nextGreater.put(s.pop(),num);
            }
            s.push(num);
        }

        while(!s.isEmpty()){
            nextGreater.put(s.pop(),-1);
        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
        
        result[i] = nextGreater.get(nums1[i]);
        }
        return result;
    }
}
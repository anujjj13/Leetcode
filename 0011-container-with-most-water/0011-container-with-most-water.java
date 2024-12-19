class Solution {
    public int maxArea(int[] height) {
        int lp =0 , rp = height.length-1;
        int maxwtr=0;
        while(lp<rp){
           
                int width = rp - lp;
                int ht = Math.min(height[lp],height[rp]);
                int ans = ht*width;
                maxwtr = Math.max(maxwtr,ans);
                if(height[lp]<height[rp]){ 
                    lp++;
                }
                else {
                    rp--;
                }
            }
        
        return maxwtr;
    }
}  
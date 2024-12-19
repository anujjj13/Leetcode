class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> ans= new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        int a=0, b=0 ;
        int n =grid.length;
        int expsum=0 ; int  actualsum =0;
        for (int i =0; i < n; i++){

            for(int j =0;j< n ; j++){
                actualsum +=grid[i][j];

                if(s.contains(grid[i][j])){
                a= grid[i][j];
                ans.add(a);
                }
                s.add(grid[i][j]);
            }
           
        }
        expsum = (n*n)*(n*n+1)/2;
        b = expsum + a -actualsum ;
        ans.add(b);
        return new int[]{a, b};

    }
}
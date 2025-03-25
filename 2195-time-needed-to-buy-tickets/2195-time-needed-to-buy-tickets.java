class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time =0;
        for(int c=0;c<tickets.length;c++){
            if(c<=k){
            time+=Math.min(tickets[c],tickets[k]);
            }
            else{
                time+=Math.min(tickets[c],tickets[k]-1);
            }
        }
        return time;
    }
}
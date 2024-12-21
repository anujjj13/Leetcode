class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int n =s.length();
        Set<Character> ans = new HashSet<>();
        int left=0;
        for(int right = 0;right<n;right++){
            if(!ans.contains(s.charAt(right))){
                ans.add(s.charAt(right));
                maxlen = Math.max(maxlen,right-left+1);
            }
            else{
                while(ans.contains(s.charAt(right))){
                    ans.remove(s.charAt(left));
                    left++;
                }
                ans.add(s.charAt(right));
            }
        }
        return maxlen;
    }
}
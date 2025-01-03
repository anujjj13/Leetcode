class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        return false;
        int[] s1map = new int[26];
        int[] s2map = new int[26];
        for(char c: s1.toCharArray()){
            s1map[c-'a']++;
        }
        int windowsize=s1.length();
        for(int i =0;i<s2.length();i++){
            s2map[s2.charAt(i)-'a']++;
            if(i>=windowsize){
                s2map[s2.charAt(i-windowsize)-'a']--;
            }
            if(Arrays.equals(s1map,s2map)){
                return true;
            }
        }
        return false;
    }
    
}
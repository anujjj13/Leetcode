class Solution {
    public String minWindow(String s, String t) {
        int ws=0, we=0, minlength=Integer.MAX_VALUE, startidx=0, matched=0;
        Map<Character,Integer> tmap = new HashMap<>();
        for(char ch : t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        for(we=0;we<s.length();we++){
            char currchar = s.charAt(we);
            if(tmap.containsKey(currchar)){
                tmap.put(currchar,tmap.get(currchar)-1);
                if(tmap.get(currchar)>=0){
                    matched++;
                }
            }
            while(matched == t.length()){
                if(minlength>(we-ws+1)){
                    minlength=we-ws+1;
                    startidx=ws;
                }
                char leftchar = s.charAt(ws++);
                if(tmap.containsKey(leftchar)){
                    if(tmap.get(leftchar)==0){
                        matched--;
                    }
                    tmap.put(leftchar,tmap.get(leftchar)+1);
                }
            }
        }
        if(minlength>s.length()){
            return "";
        }
        return s.substring(startidx,startidx+minlength);
    }
}
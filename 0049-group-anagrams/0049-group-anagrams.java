class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> anagramMap = new HashMap<>();
        for(String str:strs){
            char[] chararray = str.toCharArray();
            Arrays.sort(chararray);
            String sortedstring =  new String(chararray);
            if(!anagramMap.containsKey(sortedstring)){
                anagramMap.put(sortedstring, new ArrayList<>());
            }
            anagramMap.get(sortedstring).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
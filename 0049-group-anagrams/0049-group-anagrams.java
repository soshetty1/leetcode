class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s: strs){
            char[] ch = s.toCharArray();
             Arrays.sort(ch);
            String mapkey= String.valueOf(ch);
            
            if(!map.containsKey(mapkey)) {
                map.put(mapkey, new ArrayList());
                map.get(mapkey).add(s);
            }
            else
              map.get(mapkey).add(s);
        }
        return new ArrayList(map.values());
    }
}
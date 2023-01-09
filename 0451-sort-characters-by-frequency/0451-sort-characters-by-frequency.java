class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for( var kv : s.toCharArray()){
            map.put(kv,map.getOrDefault(kv,0) +1 );
        }
        
        List<Character> ch= new ArrayList<>(map.keySet());
        Collections.sort(ch, (a,b) -> map.get(b)- map.get(a));
        
        StringBuilder sb = new StringBuilder();
        for(char c: ch ){
            int copies= map.get(c);
            for(int i=0; i< copies;i++ )
                sb.append(c);
        }
            return sb.toString();

    }
    
}
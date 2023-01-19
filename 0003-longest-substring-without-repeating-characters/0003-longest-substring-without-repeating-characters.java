class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right=0;
        int left=0;
        int res= 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(right< s.length()){
            char c= s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            
            while(map.get(c) > 1) {
                char l= s.charAt(left);
                map.put(l,map.get(l) -1);
                left++;      
            }
            
             res= Math.max( res, right- left+1);
            right++;
        }
         return res;
        
        
    }
}
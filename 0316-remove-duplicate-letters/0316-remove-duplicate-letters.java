class Solution {
    public String removeDuplicateLetters(String s) {
        
        HashSet<Character> seen = new HashSet<>();
        Stack<Character> stack= new Stack<>();
        HashMap<Character, Integer> last_occurance = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            last_occurance.put(s.charAt(i),i);
        }
        
        for(int i=0;i<s.length();i++){
            
            char c= s.charAt(i);
            
            if(!seen.contains(c))
            {
                
                while(!stack.isEmpty() && c<stack.peek() && last_occurance.get(stack.peek()) >i)
                {
                    seen.remove(stack.pop());
             
                }
                
                seen.add(c);
                stack.push(c);
    }
            
        }
        
        
        StringBuilder res = new StringBuilder(stack.size());
        for(Character c: stack ){
            res.append(c.charValue());
        }
                      return   res.toString();

    }
  
 
}
    

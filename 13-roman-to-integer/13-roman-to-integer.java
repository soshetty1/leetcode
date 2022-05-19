
class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> HM = new HashMap();
      
        HM.put("I",1);
        HM.put("V",5);
        HM.put("X",10);
        HM.put("L",50);
        HM.put("C",100);
        HM.put("D",500);
        HM.put("M",1000);  
          int result=0;
        
        for(int i=0;i<s.length();i++)
        {
            
            if( i>0 && HM.get(String.valueOf(s.charAt(i))) > HM.get(String.valueOf((s.charAt(i-1)))))
            {
                result+= HM.get(String.valueOf((s.charAt(i))))- 2 * HM.get(String.valueOf((s.charAt(i-1))));
            }
            else{
            
          result+=HM.get(String.valueOf(s.charAt(i)));
        }
    }
        
        return result;
    }
}
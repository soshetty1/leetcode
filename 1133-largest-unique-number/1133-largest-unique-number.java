class Solution {
    public int largestUniqueNumber(int[] nums) {
        int res=0;
        int count =1;
        TreeMap <Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        
      for(int a: nums){
	            if(!map.containsKey(a)){
	                count =1;
	                map.put(a, count);
	            }
	            else if(map.containsKey(a)){
	                map.put(a, count+1);
	            }
	        }
        for( var entry: map.entrySet())
            if(entry.getValue() == 1){
                res= entry.getKey();
                break;
                
            }
        else{
            res= -1;
        }
           return res;
    }
 
    
    

}

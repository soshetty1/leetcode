class Solution {
    public int[] arrayRankTransform(int[] arr) {
    
        	  HashMap<Integer, Integer> map = new HashMap<>();
        int[] copy = Arrays.copyOf(arr, arr.length);  // O(n)
        Arrays.sort(copy); //O(nlogn)
		 int count =1;
		  
		  for( int a: copy) {
			  
			  if(!map.containsKey(a)) {
				  map.put(a, count++);
				  
				  
				  
			  }
		  }
			  
			  
			  int res[] = new int[arr.length];
			  
			  
			  for( int i=0 ; i< arr.length; i++) {
				  if(map.containsKey(arr[i])) {
					  
					  res[i] = map.get(arr[i])  ;
					  
				  }
				  
			  }
			  return res;
        
        
                

    }
}
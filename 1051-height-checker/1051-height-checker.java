class Solution {
    public int heightChecker(int[] heights) {
        int[] a = heights.clone();
        int i=0,j=0;
        Arrays.sort(a);
        
        
        int count = 0;
        
       
        
        while(i<heights.length && j< a.length ){
            
            if(heights[i]!= a[j]){
                count = count+1;
            }
              i++;
        j++;
        }
      
       return count; 
        
        
        
    }
}
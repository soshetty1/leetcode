class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        // sumA - x+y = sumB+x-y
//        sumA+2y = summB+2x
        //  x= (sumA-sumB+2y) /2
        
    
        
    Set<Integer> set = new HashSet<Integer>();

            int sumA=0;
        int sumB=0;
         for(int x: aliceSizes)
         {
             sumA= sumA+x;
         set.add(x);

             
     }
        
        for(int y: bobSizes)
        {
            sumB= sumB+y;
          }
        
        for(int j: bobSizes){
           int  temp= (sumA-sumB+2*j) /2;
            if(set.contains(temp))
            {
                return new int[]{temp,j};
        }
        }
        
return new int[] {0,0};
            
    }
}
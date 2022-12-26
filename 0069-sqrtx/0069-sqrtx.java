class Solution {
    public int mySqrt(int x) {
  
        if(x<2){
            return x;
        }
       
  
        int start=2;
        int end= x/2;
        long res=0;
        
        while(start<=end){
             int mid = start+(end-start)/2;
            
            res= (long)mid*(long)mid;
            
            if(res>x)
                end= mid-1;
            else if( res<x)
                start= mid+1;
           else
               return mid;
        }
        
        return end;
    }}
        
        
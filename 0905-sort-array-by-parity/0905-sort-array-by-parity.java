class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0; 
        int j = nums.length-1;
        int temp =0;
        if(nums.length<2){
             return nums;
        }
        
        
        while ( i<j)
        {   
            
        while( nums[i] %2 ==0 && i<j){
            i++;
        }
           
            while( nums[j] %2 != 0 &&i<j ) {
                j--;
                
            }
            
            if(i< j){
            temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            i++;
            j--;
        }}
      return nums;     
        
    }
}
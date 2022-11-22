class Solution {
    public int dominantIndex(int[] nums) {
        int m=1;
        int max_value= nums[1];  
        for( int i=0 ;i < nums.length; i++){
            
            if(nums[i] > max_value){
                 m= i;
                max_value= nums[i];
            }
        }
        int i=0;
       while(i<nums.length){
            
            if(nums[i] *2 <= max_value || nums[i] == max_value){
                i++;
            }
            else {
                 return -1;
            }
        }
        return m;
    }
}
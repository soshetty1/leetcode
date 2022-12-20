class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        
        int i=0; 
        int sum=0;
        int temp=0;
        int j= nums.length-1;
        
        while( i<j){
            sum= nums[i] + nums[j];
            
            if(sum>=k){
                j--;
            }
            else{
                if(sum > temp)
                temp=sum;
                i++;
            }
            
        }
        
        if(temp ==0){
            return -1;
        }
        else
        {
            return temp;
        }
        
        
    }
}
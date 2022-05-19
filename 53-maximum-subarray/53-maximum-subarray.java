class Solution {
    public int maxSubArray(int[] nums) {
     //kadane's algo
        
 int sum=0 ,max_sum = nums[0];
        for (int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            
            if(sum > max_sum)
                max_sum= sum;
            if(sum<0)
                sum=0;
        
        }   
        return max_sum;

    }
}
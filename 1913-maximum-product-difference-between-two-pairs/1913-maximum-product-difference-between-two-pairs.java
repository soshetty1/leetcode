class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int i=0;
         int j=nums.length -1;
        int res=0;
        
        int maxp= nums[j]*nums [j-1];
        int minp =nums[i] *nums[i+1];
        res= maxp- minp;
           return res;
        
    }
    
 
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
                boolean flag = true;
if(nums.length==1) {
			 return false;
		 }
        for(int i=0; i<nums.length-1; i++){
            
            if(nums[i]== nums[i+1]){
                
                flag = true;
                break;
            }
            
            else
            {
                flag = false;
            }
        }
        return flag;
    }
}
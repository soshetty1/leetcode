class Solution {
    public int majorityElement(int[] nums) {
int i=0;
		int element=nums[i]; int majority=0;
		 for(i=0;i<nums.length;i++) {
			 
			 if(majority==0) {
				 element=nums[i];
			 }
				 
			  if(element ==nums[i]) {
					 majority++;
					 }
				 else {
					 majority --;
				 }
				 
			 }
		 return element;
		 }}
		 
        
    

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=0;
        int sum=0;
        int temp = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i< nums.length;i++){
            
            int low= i+1;
            int high = nums.length-1;
             while(low<high){
                  sum = nums[i]+nums[low]+nums[high];
                 
                int min=Math.abs( target- sum);
                 
                 
                if(min< Math.abs(temp)){
                   res = sum;
                    temp=min;
                }
                 
                 if(sum >target){
                     high--;
                 }
                 else if( sum<target){
                     low++;
                 }
                 else {
                     return target;
                 }
                 
                 
                     
                     
                 }
             }
        
            return res;

    }
    
}
class Solution {
    public int thirdMax(int[] nums) {
        
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
       
        for(int i=0; i<nums.length-1; i++){
            
            if(  nums[i]!= nums[i+1]){
                arr.add(nums[i]);     
            }
        }
        
        arr.add(nums[nums.length-1]);
        
        if(arr.size()<3){
            return arr.get(arr.size()-1);
        }
        else{
            return arr.get(arr.size()-3);
        }
    }}
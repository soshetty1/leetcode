class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      Arrays.sort(nums);
        List<Integer> res= new ArrayList<>();
        int i=0;
        while ( i < nums.length){
            if(nums[i]== target){
                res.add(i);
            }
         i++;
        }
    return res;
    
    
}
}
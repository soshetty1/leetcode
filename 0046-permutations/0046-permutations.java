class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<Integer> templist = new ArrayList<>();
        List<List<Integer>> result= new ArrayList<>();
        
        backtrack(result, new ArrayList<>(),nums);
        return result;
        
    }
    
    public  void backtrack(List<List<Integer>> result, List<Integer>  templist, int[] nums){
        
        if(templist.size() == nums.length){
            result.add(new ArrayList<>(templist) );
        }
        else{
            for(int i=0; i<nums.length; i++){
                if(templist.contains(nums[i]))
                    continue;
                templist.add(nums[i]);
                backtrack(result,templist,nums);
                templist.remove(templist.size()-1);
            }
        }
    }
}



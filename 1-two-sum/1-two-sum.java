class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> HM = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp= target -nums[i];
            if(HM.containsKey(comp)){
                return new int[] {i,HM.get(comp)};
            }
            else
                HM.put(nums[i],i);     
    }
        return null;
}}
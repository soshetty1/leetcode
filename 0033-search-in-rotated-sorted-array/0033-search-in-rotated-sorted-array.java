class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res=0;
        int count=0;

for(int i=0; i<nums.length;i++){
    map.put(nums[i], count);
    count+=1;

}

if(map.containsKey(target)){
res= map.get(target);
    return res;
}
        else{
            return -1;
        }

}}

   


class Solution {
    public int maximumProduct(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
 
        int n= nums.length-1;

        // Sort the array in ascending order
        Arrays.sort(nums);
 
        // Return the maximum of product of last three
        // elements and product of first two elements
        // and last element
        return Math.max(nums[0] * nums[1] * nums[n],
                nums[n - 1] * nums[n - 2] * nums[n]);
    }}
class Solution {
  
    public int threeSumClosest(int[] nums, int target) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                int min = Math.abs(target - sum);
                if (min < Math.abs(target - res)) {
                    res = sum;
                }
                if (sum > target) {
                    high--;
                } else if (sum < target) {
                    low++;
                } else {
                    return target;
                }
            }
        }
        return res;
    }
}
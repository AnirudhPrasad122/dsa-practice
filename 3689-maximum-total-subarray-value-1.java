class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        int a = nums[0];
        int b = nums[0];
        for(int i = 0 ; i < n ; i++){
            a = Math.min(a,nums[i]);
            b = Math.max(b,nums[i]);
        }
        return (long) (b - a) * k;
    }
}
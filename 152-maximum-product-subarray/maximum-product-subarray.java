class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int minProduct = nums[0];
        int maxProduct = nums[0];
        int ans = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] < 0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct*nums[i]);
            ans = Math.max(ans, maxProduct);
        }
        return ans;
    }
}
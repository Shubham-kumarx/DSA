class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int consecutiveZeroes = 0;
        long count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                consecutiveZeroes++;
            } else consecutiveZeroes = 0;
            count += consecutiveZeroes;
        }
        return count;
    }
}
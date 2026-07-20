
class Solution {
    public int majorityElement(int[] nums) {
        // int n = nums.length;
        // HashMap<Integer, Integer> freq = new HashMap<>();
        // int maxi = nums[0];
        // for(int i = 1; i<n; i++){
        //     if(nums[i] > maxi) maxi = nums[i];
        // }

        // for(int i = 0; i < n; i++){
        //     freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        // }

        // int majority = n/2;
        // int majEle = Integer.MIN_VALUE;
        // int ele = 0;
        // int count = 0;
        // for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
        //     ele = entry.getKey();
        //     count = entry.getValue();
        //     if(count > majority) majEle = ele;
        // }
        // return majEle;
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0) {
                count++;
                candidate = num;
            }
            else if(num == candidate) count++;
            else count--;
        }

        return candidate;
    }
}
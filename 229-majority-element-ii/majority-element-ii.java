class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        int appearTimes = n / 3;
        for(Integer key : freq.keySet()){
            if(freq.get(key) > appearTimes) ans.add(key);

        }
        return ans;
    }
}
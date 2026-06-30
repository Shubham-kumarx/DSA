class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // ---- BRUTE FORCE -------
        // for(int i = 0; i< n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         if(nums[i] + nums[j] == target) return new int[] {i,j};
        //     }
        // }
        // ------ OPTIMAL---------
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int moreNeeded = target - num;
            if(map.containsKey(moreNeeded)) return new int[] {map.get(moreNeeded), i};
            map.put(num, i);
        }

        
        return new int[] {-1, -1};
    }
}
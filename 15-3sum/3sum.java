class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /* --- BRUTE FORCE ---
        int n = nums.length;
        Set<List<Integer>> tripletSet = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        tripletSet.add(temp);
                    }

                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(tripletSet);
        return ans;

        ------ Better -------
         Set<List<Integer>> tripletSet = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            Set<Integer> seen = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                int third = - (nums[i] + nums[j]);
                if(seen.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    tripletSet.add(temp);
                }
                seen.add(nums[j]);
            }
            
        }
        List<List<Integer>> ans = new ArrayList<>(tripletSet);
        return ans;
    */
    List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
        
    }
}
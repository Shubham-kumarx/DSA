class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Map<Integer, Integer> freq = new HashMap<>();
        // List<Integer> ans = new ArrayList<>();
        // int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        // }
        // int appearTimes = n / 3;
        // for(Integer key : freq.keySet()){
        //     if(freq.get(key) > appearTimes) ans.add(key);

        // }
        // return ans;

        int n = nums.length;
        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(cnt1 == 0 && ele2 != nums[i]){
                ele1 = nums[i];
                cnt1 = 1;
            } else if(cnt2 == 0 && ele1 != nums[i]){
                ele2 = nums[i];
                cnt2 = 1;
            }else if( ele1 == nums[i]) cnt1++;
            else if(ele2 == nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
            
        }
        cnt1 = 0; cnt2 = 0;
        int mini = n/3;
        for(int i = 0; i < n; i++){
            if(ele1 == nums[i]) cnt1++;
            else if(ele2 == nums[i]) cnt2++;
        }
        List<Integer> result = new ArrayList<>();
        if(cnt1 > mini) result.add(ele1);
        if(cnt2 > mini && ele1 != ele2) result.add(ele2);
        return result;
    }
}
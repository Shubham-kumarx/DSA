class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> seen = new HashSet<>();
        for(Integer key : map.keySet()){
            if(seen.contains(map.get(key))) return false;
            seen.add(map.get(key));
        }
        return true;
    }
}
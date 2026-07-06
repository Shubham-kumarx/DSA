class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map<String, List<String>> map = new HashMap<>();
        // for(String str : strs){
        //     char[] ch = str.toCharArray();
        //     Arrays.sort(ch);
        //     String key = new String(ch);
        //     map.putIfAbsent(key, new ArrayList<>());
        //     map.get(key).add(str);
            
        // }
        // return new ArrayList<>(map.values());
        // Time Complexity

        // Sorting each string takes O(k log k).

        // For n strings:

        // Time: O(n × k log k)

        // where:

        // n = number of strings
        // k = maximum length of a string

        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(char ch : str.toCharArray()) count[ch - 'a']++;
            StringBuilder sb = new StringBuilder();
            for(int num : count){
                sb.append('#');
                sb.append(num);
            }
            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
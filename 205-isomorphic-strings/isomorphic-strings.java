class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        // HashMap<Character, Character> map = new HashMap<>();
        // HashSet<Character> used = new HashSet<>();
        // for(int i = 0; i < s.length(); i++){
        //     char sChar = s.charAt(i);
        //     char tChar = t.charAt(i);
        //     if(map.containsKey(sChar)){
        //         if(map.get(sChar) != tChar) return false;
                
        //     }else {
        //             if(used.contains(tChar)) return false;
        //             map.put(sChar, tChar);
        //             used.add(tChar);
        //         }
        // }
        // return true;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

                for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check s -> t mapping
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar)
                    return false;
            } else {
                sMap.put(sChar, tChar);
            }

            // Check t -> s mapping
            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar)
                    return false;
            } else {
                tMap.put(tChar, sChar);
            }
        }

        return true;
        
    }
}
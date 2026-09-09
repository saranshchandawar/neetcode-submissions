class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> set = new HashMap<>();
        Map<Character, Integer> set2 = new HashMap<>();

        for(char c : s.toCharArray()){
            if(set.containsKey(c)){
                set.put(c, set.get(c) + 1);
            }else{
                set.put(c, 1);
            }
        }

        for(char c : t.toCharArray()){
            if(set2.containsKey(c)){
                set2.put(c, set2.get(c) + 1);
            }else{
                set2.put(c, 1);
            }
        }

        return set.equals(set2);
    }
}
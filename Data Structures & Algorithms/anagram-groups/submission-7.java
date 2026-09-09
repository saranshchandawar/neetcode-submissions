class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> h1=new HashMap<>();

        for(String str:strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);

            String s=new String(c);

            h1.putIfAbsent(s,new ArrayList<>());
            h1.get(s).add(str);
        }
        return new ArrayList<>(h1.values());
    }
}

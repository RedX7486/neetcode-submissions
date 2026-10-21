class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        String key;
        char[] word;
        Map<String, List<String>> sorted = new HashMap<>();
        for (String s : strs){
            
            word = s.toCharArray();
            Arrays.sort(word);
            key = String.valueOf(word);
            
            sorted.putIfAbsent(key,new ArrayList<>());
            sorted.get(key).add(s);
        
        }
        
        return new ArrayList<>(sorted.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        String key;
        char[] word;
        Map<String, List<String>> sorted = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            
            word = strs[i].toCharArray();
            Arrays.sort(word);
            key = String.valueOf(word);
            
            if (!sorted.containsKey(key)) {
                List<String> wordList = new ArrayList<>();
                sorted.put(key,wordList);
            }

            sorted.get(key).add(strs[i]);
        
        }
        
        return new ArrayList<>(sorted.values());
    }
}

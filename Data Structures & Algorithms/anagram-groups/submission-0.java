class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        char[] word;
        List<char[]> sorted = new ArrayList<>();
        for (int i = 0; i < strs.length; i++){
            
            word = strs[i].toCharArray();
            Arrays.sort(word);
            
            sorted.add(word);
        }
        
        char[] charS;
        char[] charT;
        boolean[] used = new boolean[strs.length];
        List<List<String>> allAnagrams = new ArrayList<>();
        for (int i = 0; i < strs.length; i++){
            
            if (used[i]) {continue;}

            List<String> anagrams = new ArrayList<>(); 
            anagrams.add(strs[i]);
            used[i] = true;

            charS = sorted.get(i);

            for (int x = i+1; x < strs.length; x++){
                
                if (used[x]) {continue;}
                if (strs[i].length() != strs[x].length()) {continue;}
                
                
                charT = sorted.get(x);

                if (Arrays.equals(charS, charT)) {
                    anagrams.add(strs[x]);
                    used[x] = true;
                }

                
            }

            allAnagrams.add(anagrams);
            
        }

        return allAnagrams;
    }
}

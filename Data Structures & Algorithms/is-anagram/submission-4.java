class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {return false;}
        
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        char[] charT = t.toCharArray();
        Arrays.sort(charT);

        if (!Arrays.equals(charS, charT)) {
            return false;
        }

        return true;
    }
}

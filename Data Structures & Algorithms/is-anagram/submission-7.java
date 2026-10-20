class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        if (!Arrays.equals(charS, charT)) {
            return false;
        }
        return true;
    }
}

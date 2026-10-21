class Solution {
    public boolean isPalindrome(String s) {
        char[] word = s.toCharArray();

        int i = 0;
        int j = word.length-1;

        while (i < j){
            if (!Character.isLetterOrDigit(word[i])){
                i++;
                continue;

            } else if (!Character.isLetterOrDigit(word[j])) {
                j--;
                continue;

            } else if (Character.toLowerCase(word[i]) != Character.toLowerCase(word[j])){
                return false;

            } else {
                i++;
                j--;
            }

        }

        return true;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        char[] word = sb.toString().toLowerCase().toCharArray();

        int i = 0;
        int j = word.length-1;
        
        while (i < j){
            if (word[i] != word[j]){
                return false;

            }
            i++;
            j--;

        }

        return true;
    }
}

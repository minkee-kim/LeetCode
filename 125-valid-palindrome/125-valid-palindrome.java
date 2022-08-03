class Solution {
    public boolean isPalindrome(String s) {
         String a = s.toLowerCase();
            int i=0;
            int j = a.length()-1;
            while(i < j) {
                char start = a.charAt(i);
                char end = a.charAt(j);
                if (!Character.isLetterOrDigit(start)) {
                    i++;
                    continue;
                }

                if(! Character.isLetterOrDigit(end)) {
                    j--;
                    continue;
                }
                if(start!=end) {
                    return false;
                }
                i++;
                j--;
            }
    return true;



    }
}
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {return false;}

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        String c = Arrays.toString(a);
        String d = Arrays.toString(b);

        if(c.equals(d)) {return true;}    
        return false;

       
    }
}
  
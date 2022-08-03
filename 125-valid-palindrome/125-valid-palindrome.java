class Solution {
    public boolean isPalindrome(String s) {
         String a = s.toLowerCase();
        char[] ab = a.toCharArray();
        String b = "";
        for (int i=0,j=ab.length;i<j;i++) {
            if ( ('A' <=ab[i]  && ab[i] <='Z') || ('a'<= ab[i] && ab[i]<='z') || ('0' <=ab[i] && ab[i] <='9'
            )  ) {
                b =b.concat(""+ab[i]);
            }

        }

        char[] fwd = b.toCharArray();
        char[] bwd = new char[fwd.length];
        int x =0;
        for (int j= fwd.length-1;j>=0;j--) {
            bwd[x] = fwd[j];
            x++;
        }
        String c = "";
        for(char bw : bwd) {
            c=c.concat(""+bw);
        }
        return b.equals(c);

    }
}
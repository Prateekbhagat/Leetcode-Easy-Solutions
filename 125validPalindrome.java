class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        for(char c: s.toCharArray())
        {
            if(Character.isDigit(c) || Character.isLetter(c))
            {
                s1+=c;
            }
        }
        s1 = s1.toLowerCase();
        int a_pointer =0;
        int b_pointer = s1.length() -1;
        while (a_pointer <= b_pointer)
        {
            if(s1.charAt(a_pointer) != s1.charAt(b_pointer))
            {
                return false;
            }
            a_pointer++;
            b_pointer--;
        }
        return true;
    }
}
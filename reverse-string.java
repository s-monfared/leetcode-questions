class Solution {
    public void reverseString(char[] s) {
        
        
        // char[] copiedArray = new char[s.length];
        // System.arraycopy(s, 0, copiedArray, 0, s.length);
        // for (int i = 0 ; i < s.length ; i++){
        //     s[i] = copiedArray[s.length - 1 - i];
        // }
        
        char tmp = 's';
        
        for (int i = 0 ; i < s.length/2 ; i++){
            tmp = s[i];
            // System.out.print("first:" + s[i]);
            s[i] = s[s.length - 1 - i];
            // System.out.println(" second:" + s[i]);
            s[s.length - 1 - i] = tmp;
        }
        
        
    }
}

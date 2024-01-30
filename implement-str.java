class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()){
            return -1;
        }
        int j = 0;
        int k = 0;
        for (int i = 0 ; i <= haystack.length() - needle.length() ; i ++ ){
            k = i;
            while (haystack.charAt(i) == needle.charAt(j)){
                if (j == needle.length() - 1){
                    return i - j;
                }
                i ++;
                j ++;
                
            }
            j = 0;
            i = k;
            
            
        }
        return -1;
    }
}

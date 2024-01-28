import java.util.Hashtable;
class Solution {
    public boolean isAnagram(String s, String t) {
        
//         if (s.length() != t.length()){
//             return false;
//         }
        
//         Hashtable<Character , Integer> hashtable = new Hashtable<>();
//         for (int i = 0 ; i < s.length() ; i ++){
//             hashtable.put(s.charAt(i) ,  hashtable.getOrDefault(s.charAt(i) , 0) + 1);
//         }
        
//         for (int i = 0 ; i < t.length() ; i ++){
//             if (hashtable.getOrDefault(t.charAt(i) , 0) == 0){
//                 return false;
//             } else {
//                 hashtable.put(t.charAt(i) ,  hashtable.getOrDefault(t.charAt(i) , 0) - 1);  
//             }
//         }
        
//         return true;
        
        
        if(s.length() != t.length()) return false;
        int[] dic = new int[26];
        for(char c : s.toCharArray()){
            dic[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            dic[c - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(dic[i] != 0) return false;
        }
        return true;
        
        
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // char[] str1 = s.toCharArray();
        // char[] str2 = t.toCharArray();
        // Arrays.sort(str1);
        // Arrays.sort(str2);
        // return Arrays.equals(str1, str2);
        
        
    }
}

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
// import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
//         // Dictionary<Character, Integer> dict= new Hashtable<>();
//         HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
//         // dict.put("Alice", 25);
        
//         for (int i = 0 ; i < s.length() ; i ++){
//             // String value = Integer.toString(dict.get(s.charAt(i)));
            
//             if (dict.containsKey(s.charAt(i))) {
//                 // value = 1;
//                 dict.put(s.charAt(i), 1);
//             } else {
//                 // value = 0;
//                 dict.put(s.charAt(i), 0);
//             }
//         }
        
//         Enumeration<Character> k = dict.keys();
//         char key = 's';
//         while (k.hasMoreElements()) {
//             key = k.nextElement();
//             // System.out.println("Key: " + key + ", Value: " + dict.get(key));
//             if (dict.get(key) == 0){
//                 break;
//             }
//         }
        
//         for (int i = 0 ; i < s.length() ; i ++){
//             if (s.charAt(i) == key){
//                 return i;
//             }
//         }
        
//         return 0;
        
        
        Hashtable<Character , Integer> hashtable = new Hashtable<>();
        for (char c : s.toCharArray())
        {
            hashtable.put(c ,  hashtable.getOrDefault(c , 0) +1);
        }

        if (!hashtable.containsValue(1)) return -1;

        for (int i = 0; i < s.length(); i++) {
            if (hashtable.get(s.charAt(i)) == 1) return i;
        }        
        
        return -1;
        
    }
}




        

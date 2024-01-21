import java.lang.Math;

class Solution {
    public int reverse(int x) {
//         int y = 0;
//         int s = 0;
//         if (x == 0){
//             return 0;
//         } else if (x > 0){
//             s = 1;
//         } else if (x < 0){
//             s = -1;
//         }
//         x = Math.abs(x);
        
//         while(x != 0){
//             y = y * 10 + (x % 10);
//             x = x / 10;
//         }
        
//         if (y > 2147483647){
//             return 0;
//         }
        
//         if (s == 1){
//             return y;   
//         } else {
//             return -y;
//         }
        
        
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
        
        
        
    }
}

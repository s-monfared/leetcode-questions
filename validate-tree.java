// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public boolean isValidBST(TreeNode root) {
        
//         boolean l = true;
//         boolean r = true;
//         // if (root.left == null && root.right == null){
//         //     return true;
//         // } 
//         if (root.right != null){
//             if ( root.val >= root.right.val){
//                 return false;
//             } else {
//                 r = isValidBST(root.right);
//             }
//         }
//         if (root.left != null){
//             if (root.left.val >= root.val){
//                 return false;
//             } else {
//                 l = isValidBST(root.left);
//             }
//         }
        
//         return l && r;
        
        
//     }
// }
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}

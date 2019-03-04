// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//
// For example:
// Given binary tree [3,9,20,null,null,15,7],
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
//
//
//
// return its level order traversal as:
//
// [
//   [3],
//   [9,20],
//   [15,7]
// ]
//
//


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> itemQueue = new LinkedList<TreeNode>();
        if( root != null){
            itemQueue.offer(root);
            int layerNum = 1;
            while(itemQueue.peek() != null){
                int j = layerNum;
                List<Integer> tempList = new ArrayList();
                for(int i = 0; i < j; i++){
                    TreeNode tree = itemQueue.poll();
                    tempList.add(tree.val);
                    layerNum -= 1;
                    if(tree.left != null){
                        itemQueue.offer(tree.left);
                        layerNum += 1;
                    }
                    if(tree.right != null){
                        itemQueue.offer(tree.right);
                        layerNum += 1;
                    }
                }
                result.add(tempList);
            }
        }
        return result;
    }
}

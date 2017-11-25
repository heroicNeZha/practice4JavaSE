package LeetCode;

/**
 * Created by Administrator on 2017/11/25.
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *    1
 *   / \
 *  2   2
 *  \   \
 *  3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        while(leftNode!=null&&rightNode!=null){

            if (leftNode.left!=null&&rightNode.left!=null){
                leftNode = leftNode.left;
                rightNode = rightNode.left;
            }

            if (leftNode.right!=null&&rightNode.right!=null){
                leftNode = leftNode.right;
                rightNode = rightNode.right;
            }

        }

        if(leftNode==null&&rightNode==null)
            return true;
        else
            return false;
    }
}

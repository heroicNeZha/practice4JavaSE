package LeetCode;

/**
 * Created by Administrator on 2017/11/24.
 *
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class SameTree {
    public static void main(String[] args) {
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null){
            if (q==null)
                return true;
            else
                return false;
        }else{
            if (q==null)
                return false;
        }

        //判断左子树是否相同
        if(p.left!=null) {
            if (q.left != null) {
                if(!isSameTree(p.left, q.left))
                    return false;
            } else {
                return false;
            }
        }else{
            if (q.left != null){
                return false;
            }
        }

        //判断右子树是否相同
        if(p.right!=null) {
            if (q.right != null) {
                if (!isSameTree(p.right, q.right))
                    return false;
            } else {
                return false;
            }
        }else {
            if (q.right != null) {
                return false;
            }
        }


            if(p.val == q.val)
                return true;
            else
                return false;
    }
}

package solved;

public class MaximumDepthOfBinary {

    public int maxDepth(TreeNode root){
        // Базовый случай: если дерево пустое, глубина равна 0
        if(root == null){
            return 0;
        }

        // Рекурсивный вызов для левого поддерева
        int leftMaxDepth = maxDepth(root.left);

        // Рекурсивный вызов для правого поддерева
        int rightMaxDepth = maxDepth(root.right);

        // Возвращаем максимальную глубину из двух поддеревьев + 1 (для текущего узла)
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}

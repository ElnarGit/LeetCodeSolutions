package solved;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;  // Если root пустой, то subRoot точно не его поддерево
        if(isSameTree(root, subRoot)) return true; // Если деревья идентичны, возвращаем true

        // Проверяем рекурсивно левое и правое поддерево
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    private boolean isSameTree(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;  // Оба пустые - одинаковые
        if(t1 == null || t2 == null) return false; // Одно пустое, другое нет - не совпадают
        if(t1.val != t2.val) return false;         // Значения корней разные - не совпадают

        // Рекурсивно проверяем левое и правое поддерево
        return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }
}

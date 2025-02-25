package solved;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root){
        if(root == null) return true; // Пустое дерево всегда симметрично
        return isMirror(root.left, root.right); // Проверяем симметрию для левого и правого поддерева
    }

    private boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;  // Оба узла пустые -> симметричны
        if(t1 == null || t2 == null) return false; // Один из узлов пустой -> несимметрично
        if(t1.val != t2.val) return false;         // Значения узлов не совпадают -> несимметрично

        // Рекурсивно проверяем:
        // 1. Левое поддерево первого узла и правое поддерево второго узла
        // 2. Правое поддерево первого узла и левое поддерево второго узла
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);

    }
}

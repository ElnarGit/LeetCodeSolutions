package solved;

public class BalancedBinaryTree {

    // Метод для проверки, является ли дерево сбалансированным
    public boolean isBalanced(TreeNode root){
        // Проверяем дерево начиная с корня
        return checkHeight(root) != -1;
    }

    // Метод для вычисления высоты дерева
    private int checkHeight(TreeNode root) {
        // Если узел пустой, его высота 0
        if(root == null){
            return 0;
        }

        // Рекурсивно вычисляем высоту левого и правого поддеревьев
        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);

        // Если одно из поддеревьев несбалансировано (возвращает -1), сразу возвращаем -1
        if(leftHeight == -1 || rightHeight == -1){
            return -1;
        }

        // Если разница в высотах левого и правого поддерева больше 1, дерево не сбалансировано
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        // Возвращаем высоту текущего узла (1 + максимальная высота из левого и правого поддеревьев)
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

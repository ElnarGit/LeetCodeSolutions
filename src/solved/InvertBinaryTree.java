package solved;

public class InvertBinaryTree {

    // Метод для инвертирования бинарного дерева
    public TreeNode invertTree(TreeNode root){
        // Если дерево пустое, возвращаем null
        if(root == null){
            return null;
        }

        // Сохраняем левое поддерево в временной переменной
        TreeNode temp = root.left;
        // Левое поддерево заменяем правым поддеревом
        root.left = root.right;
        // Правое поддерево заменяем сохраненным левым поддеревом
        root.right = temp;

        // Рекурсивно инвертируем левое и правое поддеревья
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
        // Пример использования:
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        InvertBinaryTree solution = new InvertBinaryTree();
        System.out.println(solution.invertTree(root));

    }
}

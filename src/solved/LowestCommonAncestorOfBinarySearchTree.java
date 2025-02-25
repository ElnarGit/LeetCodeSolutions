package solved;

public class LowestCommonAncestorOfBinarySearchTree {

    // Метод для нахождения наименьшего общего предка
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Проходим по дереву, начиная с корня
        while (root != null) {
            // Если оба числа p и q меньше текущего узла, идем в левую часть
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }
            // Если оба числа p и q больше текущего узла, идем в правую часть
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
            // Если одно число меньше, а другое больше, то текущий узел - LCA
            else {
                return root;
            }
        }
        return null; // Если дерево пустое
    }
}

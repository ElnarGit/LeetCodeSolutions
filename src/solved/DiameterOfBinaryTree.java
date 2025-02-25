package solved;

public class DiameterOfBinaryTree {
    int diameter = 0; // Переменная для хранения текущего максимального диаметра

    public int diameterOfBinaryTree(TreeNode root){
        height(root); // Вызываем метод для вычисления высоты дерева, который также обновляет диаметр
        return diameter; // Возвращаем вычисленный диаметр
    }

    // Рекурсивный метод для вычисления высоты узла
    private int height(TreeNode node){
        if(node == null){
            return 0;  // Если узел равен null, его высота равна 0
        }

        int left = height(node.left);   // Рекурсивно вычисляем высоту левого поддерева
        int right = height(node.right); // Рекурсивно вычисляем высоту правого поддерева

        // Обновляем диаметр, если сумма высот левого и правого поддеревьев больше текущего диаметра
        diameter = Math.max(diameter, left + right);

        // Возвращаем высоту текущего узла,
        // которая равна максимальной высоте из левого и правого поддеревьев плюс 1
        return Math.max(left, right) + 1;
    }
}

package solved;

public class ConvertSortedArrayToBinarySearchTree {

    // Метод для преобразования отсортированного массива в сбалансированное дерево
    public TreeNode sortedArrayToBST(int [] nums){
        // Вызываем вспомогательный метод
        return buildBST(nums, 0, nums.length - 1);

    }

    // Вспомогательный метод для построения дерева
    private TreeNode buildBST(int [] nums, int left, int right){
        // Базовый случай: если массив пустой или диапазон некорректный
        if(left > right) return null;

        // Выбираем середину массива
        int mid = left + (right - left) / 2;

        // Создаём новый узел с числом из середины
        TreeNode root = new TreeNode(nums[mid]);

        // Рекурсивно строим левое и правое поддеревья
        root.left = buildBST(nums, left, mid - 1); // Левый подмассив
        root.right = buildBST(nums, mid +1, right); // Правый подмассив

        // Возвращаем текущий узел как корень поддерева
        return root;
    }
}

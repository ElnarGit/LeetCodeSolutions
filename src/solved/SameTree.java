package solved;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q){
        // Если оба дерева пустые, то они одинаковы
        if(p == null && q == null) return true;

        // Если одно из деревьев пустое, а другое нет — они не одинаковы
        if(p == null || q == null) return false;

        // Если значения текущих узлов отличаются — деревья не одинаковы
        if(p.val != q.val) return false;

        // Рекурсивно сравниваем левые и правые поддеревья
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

package easy;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        // Инициализируем кандидата на элемент большинства значением -1 (несуществующий элемент)
        int candidate = -1;

        // Инициализируем счетчик
        int count = 0;

        // Проходим по всем элементам массива
        for(int num : nums){
            // Если счетчик равен 0, обновляем кандидата на текущий элемент
            if(count == 0){
                candidate = num;
            }

            // Увеличиваем счетчик, если текущий элемент равен кандидату, и уменьшаем, если не равен
            count += (num == candidate ? 1 : -1);
    }
        // Возвращаем кандидата, который является элементом большинства
        return candidate;

}

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int [] nums1 = {3,  3, 4};
        System.out.println(majorityElement.majorityElement(nums1));
    }
}

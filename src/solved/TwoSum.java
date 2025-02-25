package solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int [] twoSum(int [] nums, int target){
        //Создаем хэш таблицу для хранения индексов элементов
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            // Вычисляем, какое значение нам нужно найти, чтобы сумма была равна target
            int complement = target - nums[i];

            // Проверяем, есть ли такое значение в хеш-таблице
            if(map.containsKey(complement)){
                // Если есть, возвращаем индексы текущего элемента и найденного элемента
                return new int [] {map.get(complement), i};
            }

            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 8, 11, 15, 7}, 9)));
    }
}

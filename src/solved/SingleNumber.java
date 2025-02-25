package solved;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    /**
     * Метод для поиска числа, которое встречается только один раз в массиве.
     * @param nums массив целых чисел, где каждое число встречается дважды, кроме одного.
     * @return число, которое встречается только один раз.
     */
    public int singleNumber(int [] nums){
        // Переменная для хранения результата
       int result = 0;

        // Проходим по всем числам в массиве
       for(int num : nums){
           // Применяем операцию XOR между текущим результатом и числом
           // Свойства XOR:
           // 1. x ^ x = 0 (любое число XOR с самим собой даёт 0)
           // 2. x ^ 0 = x (любое число XOR с 0 остаётся неизменным)
           // Благодаря этим свойствам, все числа, встречающиеся дважды, "погашаются",
           // а число, встречающееся один раз, остаётся.
           result ^= num;
       }

        // Возвращаем уникальное число
       return result;
    }


    public int singleNumber2(int [] nums){
        Set<Integer> set = new HashSet<Integer>();

        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else {
                set.add(num);
            }
        }

        return set.iterator().next();
    }
}

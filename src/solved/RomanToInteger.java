package solved;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    // Метод для преобразования римского числа в целое число
    public int romanToInt(String s){
        // Создаем Map для хранения значений римских символов
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        // Переменная для хранения конечного результата
        int result = 0;

        // Проходим по каждому символу строки
        for(int i = 0; i < s.length();i++){
            // Получаем значение текущего римского символа из Map
            int current = romanMap.get(s.charAt(i));

            // Проверяем, существует ли следующий символ, и сравниваем текущий с следующим
            if(i < s.length() - 1 && current < romanMap.get(s.charAt(i + 1))){
                // Если текущий символ меньше следующего, то вычитаем его значение
                result -= current;
            }else {
                // В остальных случаях прибавляем его значение
                result += current;
            }
        }

        // Возвращаем результат
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        System.out.println(converter.romanToInt("III"));       // 3
        System.out.println(converter.romanToInt("LVIII"));     // 58
        System.out.println(converter.romanToInt("MCMXCIV"));   // 1994
    }
}

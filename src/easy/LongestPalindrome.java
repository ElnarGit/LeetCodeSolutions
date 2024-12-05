package easy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public int longestPalindrome(String s){
        // Создаём HashMap для подсчёта количества каждого символа
        Map<Character, Integer> charCount = new HashMap<>();

        // Проходим по строке и считаем количество вхождений каждого символа
        for(char c : s.toCharArray()){
            // Для каждого символа увеличиваем его количество в Map
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0; // Переменная для хранения длины палиндрома
        boolean oddFound = false; // Флаг, который указывает, что мы нашли хотя бы один символ с нечётной частотой

        // Проходим по значениям в HashMap (по частотам символов)
        for(int count : charCount.values()){
            if(count % 2 == 0){
                // Если частота чётная, добавляем все символы в палиндром
                length += count;
            }else {
                // Если частота нечётная, добавляем все символы, кроме одного
                length += count - 1;
                oddFound = true;  // Устанавливаем флаг, так как мы можем добавить одну букву в центр палиндрома
            }
        }

        // Если была найдена хотя бы одна буква с нечётной частотой, можем добавить одну букву в центр
        if(oddFound){
            length += 1; // Добавляем 1, так как одна буква может быть в центре палиндрома
        }

        // Возвращаем итоговую длину самого длинного палиндрома
        return length;
    }
}

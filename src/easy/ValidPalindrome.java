package easy;

public class ValidPalindrome {

    //менее эффективен с точки зрения использования памяти,
    // так как создаёт дополнительные строки
    public boolean isPalindrome(String s){
        String res = s.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
        StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        return sb.toString().equals(res);
    }

    // более эффективен по памяти,
    // так как использует два указателя
    // и не требует дополнительной памяти для создания строк
    public boolean isPalindrome2(String s){
        // Инициализируем два указателя: один указывает на начало строки, другой на конец
        int left = 0;
        int right = s.length() - 1;

        // Мы продолжаем работать, пока левый указатель не пересечется с правым
        while (left < right){
            // Пропускаем все символы, которые не являются буквами или цифрами с левой стороны
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++; // Двигаем левый указатель вправо
            }

            // Пропускаем все символы, которые не являются буквами или цифрами с правой стороны
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--; // Двигаем правый указатель влево
            }

            // Сравниваем символы с левой и правой стороны, приведенные к нижнему регистру
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                // Если символы не совпадают, строка не является палиндромом
                return false;
            }

            // Если символы совпали, двигаем оба указателя
            left++; // Увеличиваем левый указатель
            right--; // Уменьшаем правый указатель
        }
        // Если все символы совпали, значит строка является палиндромом
        return true;
    }
}

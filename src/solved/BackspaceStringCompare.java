package solved;

public class BackspaceStringCompare {

    /**
     * Метод для сравнения двух строк после обработки символов '#' (backspace).
     *
     * @param s первая строка
     * @param t вторая строка
     * @return true, если строки равны после обработки, иначе false
     */
    public boolean backspaceCompare(String s, String t){
        // Начинаем с конца обеих строк
        int i = s.length() - 1;
        int j = t.length() - 1;

        // Продолжаем, пока не достигнем начала одной из строк
        while (i >= 0 || j >= 0){
            // Находим следующий действительный символ в строке s
            i = findNextChar(s,i);
            // Находим следующий действительный символ в строке t
            j = findNextChar(t,j);

            // Если оба индекса меньше 0, значит обе строки закончились одновременно
            if(i < 0 && j < 0){
                return true;
            }

            // Если один из индексов меньше 0, значит одна строка закончилась раньше другой
            if(i < 0 || j < 0){
                return false;
            }

            // Если текущие символы не совпадают, строки не равны
            if(s.charAt(i) != t.charAt(j)){
                return false;
            }

            // Переходим к предыдущему символу
            i--;
            j--;
        }

        // Если прошли оба указателя без расхождений, строки равны
        return true;
    }

    /**
     * Метод для нахождения следующего реального символа в строке, учитывая backspace.
     *
     * @param s строка
     * @param index текущий индекс
     * @return индекс следующего реального символа
     */
    private static int findNextChar(String s, int index){
        // Счетчик для отслеживания количества символов, которые нужно пропустить
        int skip = 0;
        while (index >= 0){
            if(s.charAt(index) == '#'){
                // Увеличиваем счетчик пропусков при встрече с символом '#'
                skip++;
            }else if(skip > 0){
                // Пропускаем символы, уменьшая счетчик
                skip--;
            }else {
                // Если текущий символ действительный, возвращаем его индекс
                break;
            }
            index--;  // Переходим к следующему символу (справа налево)
        }
        // Возвращаем индекс реального символа
        return index;
    }
}

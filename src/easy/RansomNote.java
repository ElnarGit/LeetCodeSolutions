package easy;

public class RansomNote {

    /**
     * Метод для проверки, можно ли составить строку ransomNote из букв строки magazine.
     * @param ransomNote Строка, которую нужно составить.
     * @param magazine Строка, из которой можно брать буквы.
     * @return true, если ransomNote может быть составлена из magazine, иначе false.
     */
    public boolean canConstruct(String ransomNote, String magazine){
        // Создаем массив для подсчета количества каждой буквы в строке magazine.
        // Массив будет хранить количество букв от 'a' до 'z',
        // где индекс 0 соответствует 'a', индекс 1 — 'b', и так далее.
        int [] charCount = new int[26];

        // Проходим по строке magazine и увеличиваем количество каждой буквы в массиве charCount
        for(int i = 0; i < magazine.length(); i++){
            // Для каждой буквы в magazine увеличиваем счетчик на соответствующем индексе
            // charAt(i) возвращает символ, поэтому отнимаем 'a' чтобы привести его к индексу от 0 до 25
            charCount[magazine.charAt(i) - 'a'] += 1;
        }

        // Теперь проходим по строке ransomNote и проверяем, можем ли мы составить её из букв из magazine
        for(int i = 0; i < ransomNote.length(); i++){
            // Если в charCount для текущего символа меньше или равно 0, то буквы не хватает
            // и мы не можем составить ransomNote из magazine, возвращаем false
            if(charCount[ransomNote.charAt(i) - 'a'] <= 0){
                return false;
            }

            // Если буква есть, уменьшаем её счетчик в charCount, так как мы её использовали
            charCount[ransomNote.charAt(i) - 'a'] -= 1;
        }

        // Если все буквы ransomNote успешно найдены и использованы, возвращаем true
        return true;
    }

    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        System.out.println(ransomNote.canConstruct("aaaa", "aabac"));
    }
}

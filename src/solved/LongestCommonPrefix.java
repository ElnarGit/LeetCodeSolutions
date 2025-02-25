package solved;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String [] strs){
        // Проверка на пустой массив или null
        if(strs == null || strs.length == 0) return "";

        // Начальный общий префикс — первая строка в массиве
        String prefix = strs[0];

        // Перебираем все строки в массиве, начиная со второй
        for(int i = 1; i < strs.length; i++){
            // Пока текущая строка не начинается с текущего префикса
            while (!strs[i].startsWith(prefix)){
                // Укорачиваем префикс, отбрасывая последний символ
                prefix = prefix.substring(0, prefix.length() -1);

                // Если префикс стал пустым, возвращаем пустую строку
                if(prefix.isEmpty()) return  "";
            }
        }

        // Возвращаем найденный общий префикс
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        // Пример 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + lcp.longestCommonPrefix(strs1)); // Output: "fl"

//        // Пример 2
//        String[] strs2 = {"dog", "racecar", "car"};
//        System.out.println("Longest Common Prefix: " + lcp.longestCommonPrefix(strs2)); // Output: ""
    }
}

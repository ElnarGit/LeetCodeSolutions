package solved;

public class CountingBits {

    // Метод, который принимает число n и возвращает массив с количеством единиц
    // в двоичном представлении каждого числа от 0 до n
    public int [] countBits(int n){
        // Создаём массив длиной n + 1, чтобы включить числа от 0 до n
        int [] bits = new int[n + 1];

        // Цикл для вычисления количества единиц для каждого числа от 1 до n
        for(int i = 1; i <= n; i++){
            // Формула:
            // bits[i >> 1]: Используем значение для числа i / 2 (сдвиг вправо на 1 бит)
            // (i & 1): Проверяем, является ли младший бит числа i равным 1 (i нечётное)
            bits[i] = bits[i >> 1] + (i & 1);
        }

        // Возвращаем массив, где для каждого числа от 0 до n указано
        // количество единиц в его двоичном представлении
        return bits;
    }


    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();

        int n1 = 2;
        int[] result1 = countingBits.countBits(n1);
        System.out.println(java.util.Arrays.toString(result1)); // Вывод: [0, 1, 1]

        int n2 = 5;
        int[] result2 = countingBits.countBits(n2);
        System.out.println(java.util.Arrays.toString(result2)); // Вывод: [0, 1, 1, 2, 1, 2]
    }
}

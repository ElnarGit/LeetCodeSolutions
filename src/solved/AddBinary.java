package solved;

public class AddBinary {

    // Метод для сложения двух бинарных строк
    public String addBinary(String a, String b){
        // Индексы для строк a и b, начинаем с конца (последний символ)
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Переменная для хранения переноса
        int carry = 0;

        // Строка для хранения результата
        StringBuilder result = new StringBuilder();

        // Цикл продолжается, пока не обработаны все символы строк и пока есть перенос
        while (i >= 0 || j >= 0 || carry != 0){
            // Начинаем с переноса
            int sum = carry;

            // Если есть цифры в строке a, добавляем их в сумму
            if(i >= 0){
                sum += a.charAt(i) - '0'; // Преобразуем символ в число (например, '1' в 1)
                i--; // Двигаемся к следующему символу в строке a
            }

            // Если есть цифры в строке b, добавляем их в сумму
            if(j >= 0){
                sum += b.charAt(j) - '0'; // Преобразуем символ в число (например, '1' в 1)
                j--; // Двигаемся к следующему символу в строке b
            }

            // Добавляем остаток от деления на 2 в результат (это будет либо 0, либо 1)
            result.append(sum % 2);

            // Обновляем перенос для следующей итерации (если сумма больше или равна 2)
            carry = sum / 2;
        }
        // Результат собран в обратном порядке, переворачиваем его
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("11", "1"));
    }
}

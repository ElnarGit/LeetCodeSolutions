package easy;

public class FibonacciNumber {

    //slowly
    public int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }

    //fast
    public int fib2(int n){
        // Обрабатываем базовые случаи:
        if(n == 0) return 0;
        if(n == 1) return 1;

        // Инициализируем первые два числа последовательности Фибоначчи
        int a = 0;
        int b = 1;

        // Итеративно вычисляем числа Фибоначчи от F(2) до F(n)
        for(int i = 2; i <= n; i++){
            // Вычисляем следующее число как сумму двух предыдущих
            int temp = a + b;

            // Обновляем значения: сдвигаем переменные
            a = b;  // Теперь a хранит b (предыдущее число)
            b = temp;  // Теперь b хранит новое число Фибоначчи
        }

        // Возвращаем результат: на момент окончания цикла b содержит F(n)
        return b;
    }

    public static void main(String[] args) {
        FibonacciNumber fib = new FibonacciNumber();
        System.out.println(fib.fib(10));
        System.out.println(fib.fib2(1000));
    }
}

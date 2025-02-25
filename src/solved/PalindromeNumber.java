package solved;

public class PalindromeNumber {

    // медленно
    public boolean isPalindrome(int x){
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString().equals(str);
    }

    // медленно, но чуть быстрее
    public boolean isPalindrome2(int x){
        String str = String.valueOf(x);
        int n = str.length();

        for(int i = 0; i < n / 2; i++){
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }

    // быстро
    public boolean isPalindrome3(int x){
        // Отрицательные числа не могут быть палиндромами, так как знак "-" не совпадает
        if(x < 0){
            return false;
        }

        // Числа, оканчивающиеся на 0, кроме самого 0, не могут быть палиндромами
        if(x % 10 == 0 && x != 0){
            return false;
        }

        // Переменная для хранения перевёрнутого числа
        int invertedNumber = 0;

        // Копия исходного числа, чтобы работать с ней в цикле
        int copyOfX = x;

        // Цикл для переворота числа
        while (copyOfX != 0){
            // Получаем последнюю цифру числа и добавляем её к перевёрнутому числу
            invertedNumber = invertedNumber * 10 + copyOfX % 10;
            // Убираем последнюю цифру из числа
            copyOfX /= 10;
        }

        // Проверяем, равно ли перевёрнутое число исходному
        return invertedNumber == x;
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(121));
    }
}

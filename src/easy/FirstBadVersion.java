package easy;

public class FirstBadVersion {

    // Метод, который проверяет, является ли версия плохой.
    private boolean isBadVersion(int n){
        int badVersion = 4;
        return n >= badVersion;
    }

    // Метод для нахождения первой плохой версии с использованием бинарного поиска.
    public int firstBadVersion(int n){
        int left = 1;  // Левая граница поиска, начинаем с первой версии
        int right = n; // Правая граница поиска, заканчиваем на последней версии

        // Пока левая граница не пересечется с правой
        while (left < right){
            // Находим середину диапазона для проверки
            int mid = left + (right - left) / 2;

            // Проверяем, плохая ли версия на позиции mid
            if(isBadVersion(mid)){
                // Если версия на mid плохая, значит первая плохая версия может быть на mid или раньше
                // Мы сужаем правую границу, чтобы продолжить поиск в левой половине
                right = mid;
            }else {
                // Если версия на mid хорошая, то первая плохая версия будет в правой половине
                // Мы сдвигаем левую границу, чтобы искать в правой части
                left = mid + 1;
            }
        }
        // Когда left == right, это и будет первая плохая версия, которую мы ищем
        return left;

    }
}

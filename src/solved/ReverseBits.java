package solved;

public class ReverseBits {

    public int reverseBits(int n) {
        int res = 0;

        for(int i = 0; i < 32; i++){
            // Сдвигаем результат влево, освобождая место для нового бита
            res <<= 1;
            // Добавляем последний бит из n в result
            res |= (n & 1);
            // Сдвигаем n вправо, чтобы обработать следующий бит
            n >>= 1;
        }
        return res;
    }
}

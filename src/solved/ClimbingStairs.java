package solved;

public class ClimbingStairs {

    /**
     * Метод для вычисления количества способов подняться на n ступеней.
     * @param n Количество ступеней.
     * @return Количество способов подняться на n ступеней.
     */
    public int climbStairs(int n){
        // Если нужно подняться только на 1 ступеньку, то существует только 1 способ
        if(n == 1) {
            return 1;
        }
        // Если нужно подняться на 2 ступеньки, то существует 2 способа (1+1 или 2)
        else if(n == 2){
            return 2;
        }

        // Создаем массив dp, который будет хранить количество способов добраться до каждой ступеньки
        int [] dp = new int[n+ 1]; // dp[i] - количество способов добраться до i-й ступеньки

        // Базовые случаи:
        // 1 способ добраться до 1-й ступеньки (один шаг)
        dp[1] = 1;

        // 2 способа добраться до 2-й ступеньки: (1 шаг + 1 шаг) или (2 шага)
        dp[2] = 2;

        // Заполняем массив dp для всех ступенек начиная с 3-й
        for(int i = 3; i <= n; i++){
            // Количество способов добраться до i-й ступеньки:
            // Это сумма способов добраться до предыдущей ступеньки и до ступеньки, перед ней.
            dp[i] = dp[i-1] + dp[i-2];
        }

        // Возвращаем количество способов добраться до n-й ступеньки
        return dp[n];
    }
}

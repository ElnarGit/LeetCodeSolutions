package easy;

public class BestTimeToBuyAndSellStock {

    // Метод для нахождения максимальной прибыли
    public int maxProfit(int [] prices){
        // Изначально минимальная цена равна цене на первый день
        int minPrice = prices[0];

        // Начинаем с 0, так как в случае, если не будет прибыли, вернем 0
        int maxProfit = 0;

        // Цикл начинается с индекса 1 (второй день), потому что первый день уже учтен
        for(int i = 1; i < prices.length; i++){
            // Если текущая цена меньше минимальной цены, обновляем минимальную цену
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            // Вычисляем прибыль, если продать акцию на текущий день
            int profit = prices[i] - minPrice;

            // Если текущая прибыль больше максимальной прибыли, обновляем maxProfit
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(prices));

    }
}

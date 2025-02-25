package solved;

public class MaximumSubarray {

    public int maxSubArray(int [] nums){
        int currentSum = nums[0]; // Начальная сумма текущего подмассива
        int maxSum = nums[0]; // Начальная максимальная сумма

        // Проходим по массиву начиная с индекса 1
        for(int i = 1; i < nums.length; i++){
            // Сравниваем: если текущий элемент больше суммы текущего подмассива с этим элементом,
            // то начинаем новый подмассив с этого элемента.
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Обновляем максимальную сумму, если текущая сумма больше
            maxSum = Math.max(maxSum, currentSum);
        }

        // Возвращаем максимальную сумму подмассива
        return maxSum;
    }
}


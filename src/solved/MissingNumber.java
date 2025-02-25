package solved;

public class MissingNumber {

    public int missingNumber(int [] nums){
        int n = nums.length; // Количество элементов в массиве
        int sum = 0;         // Переменная для хранения результата XOR

        // XOR всех чисел от 0 до n
        for(int i = 0; i <= n; i++){
            sum ^= i;
        }

        // XOR всех элементов массива
        for(int num : nums){
            sum ^= num;
        }

        // После всех операций в sum останется недостающее число
        return sum;
    }

    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();

        int[] nums1 = {3, 0, 1};
        System.out.println(solution.missingNumber(nums1)); // Вывод: 2

//        int[] nums2 = {0, 1};
//        System.out.println(solution.missingNumber(nums2)); // Вывод: 2
//
//        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
//        System.out.println(solution.missingNumber(nums3)); // Вывод: 8
    }
}

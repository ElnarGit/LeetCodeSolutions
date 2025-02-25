package solved;

public class BinarySearch {

    // долго
    public int search(int [] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    //быстро
    public int search2(int [] nums, int target){
        // Инициализация начального и конечного индексов для поиска
        int low = 0;
        int high = nums.length - 1;

        // Цикл продолжается до тех пор, пока начальный индекс меньше или равен конечному
        while(low <= high){
            // Находим индекс середины массива, чтобы делить поиск пополам
            int mid = low + (high - low) / 2;

            // Проверка, равен ли элемент в середине массива искомому значению
            if(nums[mid] == target){
                return mid;  // Если равен, возвращаем индекс
            }else if(nums[mid] < target){
                // Если элемент в середине меньше искомого значения,
                // значит искомое значение находится в правой половине массива
                low = mid + 1;
            }else {
                // Если элемент в середине больше искомого значения,
                // значит искомое значение находится в левой половине массива
                high = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(new int[]{1,2,3,4,5,6,7,8,9}, 9));
        System.out.println(bs.search2(new int[]{1,2,3,4,5,6,7,8,9}, 9));
    }
}

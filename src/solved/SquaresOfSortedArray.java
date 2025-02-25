package solved;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public int [] sortedSquares (int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;

    }

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        SquaresOfSortedArray obj = new SquaresOfSortedArray();
        System.out.println(Arrays.toString(obj.sortedSquares(nums)));
    }
}

public class PivotIndex {

    /*
   The pivot index is the index where the sum of all the numbers strictly to the left of the index
   is equal to the sum of all the numbers strictly to the index's right.
    */
    public static int pivotIndex(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = 0;

        // sum all elements of array and assign the result to right
        for (int i = 1; i < len; i++) {
            right += nums[i];
        }
        if (right == 0) return 0;

        int i = 0;
        while (i < len - 1) {
            left += nums[i];
            right -= nums[++i];
            if (left == right) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        PivotIndex pivotIndex = new PivotIndex();

        int[] a = {-1,-1,-1,-1,-1,0};

        System.out.println(pivotIndex(a));

    }
}

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int pointer = 1;

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] < nums[i+1]) {
                nums[pointer++] = nums[i+1];
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();
        int[] a = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates.removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }
}
